/* Package declaration */
package Random_Map_Generator;

import java.util.*;
import java.util.function.*;

/* থিয়রি: *Core Java* (p. 274) — IntUnaryOperator অ্যারে ফিলের জন্য, Predicate ফিল্টারিং-এ। */

public class RandomMapGenerator {
    public static void main(String[] args) {
        // ১. র‍্যান্ডম ভ্যালু জেনারেটর (IntUnaryOperator)
        IntUnaryOperator valueGenerator = i -> (int)(Math.random() * 10) + i;

        // ২. ডিফল্ট টাইল (Supplier)
        Supplier<MapTile> defaultTile = () -> new MapTile("Empty", 0);

        // ৩. মজার টাইল টাইপস
        String[] tileTypes = {
                "Mystic Forest", "Crystal Cave", "Treasure Bug Nest",
                "Volcano Vault", "Enchanted Lake", "Pixel Ruins"
        };

        // ৪. ম্যাপ অ্যারে তৈরি (Arrays.setAll)
        int mapSize = 6;
        MapTile[] gameMap = new MapTile[mapSize];
        Random random = new Random();

        Arrays.setAll(gameMap, i -> {
            int value = valueGenerator.applyAsInt(i);
            String type = tileTypes[random.nextInt(tileTypes.length)];
            return new MapTile(type, value);
        });

        System.out.println("Generated Game Map:");
        for (int i = 0; i < gameMap.length; i++) {
            System.out.println("Tile " + i + ": " + gameMap[i]);
        }
        System.out.println();

        // ৫. ভ্যালুয়েবল টাইল ফিল্টার (Predicate)
        Predicate<MapTile> valuableTile = tile -> tile.getValue() > 5;
        List<MapTile> treasures = Arrays.stream(gameMap)
                .filter(valuableTile)
                .toList();

        System.out.println("Valuable Tiles (Value > 5):");
        treasures.forEach(System.out::println);
        System.out.println();

        // ৬. টোটাল ট্রেজার ক্যালকুলেট (ToIntFunction)
        ToIntFunction<MapTile> valueExtractor = tile -> tile.getValue();
        int totalTreasure = Arrays.stream(gameMap)
                .mapToInt(valueExtractor)
                .sum();

        System.out.println("Total Treasure Value in Map: " + totalTreasure);
        System.out.println();

        // ৭. ডিফল্ট টাইল (Objects.requireNonNullElseGet)
        MapTile missingTile = null; // ধরো, লোডিং এরর
        MapTile safeTile = Objects.requireNonNullElseGet(missingTile, defaultTile);
        System.out.println("Safe Default Tile: " + safeTile);
        System.out.println();

        // ৮. অ্যান্ড্রয়েড ম্যাপ রেন্ডারিং সিমুলেশন
        System.out.println("Rendering Map on Screen...");
        for (MapTile tile : treasures) {
            System.out.println("RENDER: " + tile);
            try { Thread.sleep(600); } catch (InterruptedException e) { /* ignore */ }
        }
        System.out.println("Map Rendered! Ready for Adventure!");
    }
}