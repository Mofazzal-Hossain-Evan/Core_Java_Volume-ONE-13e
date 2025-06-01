package HashCollisionLabDino;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class HashCollisionLabDino {

    static class DinoDNA{
        int geneX, geneY;

        public DinoDNA(int geneX, int geneY) {
            this.geneX = geneX;
            this.geneY = geneY;
        }

        public int hashCode(){
            return Objects.hash(geneX, geneY);
        }

        public boolean equal(Object o ){
            if (!(o instanceof DinoDNA other)) return false;
            return geneX == other.geneX && geneY == other.geneY;
        }
        public String toString(){
            return "(" + geneX +"," + geneY +")";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🦖 Enter DNA grid range (e.g., 50 for 50x50): ");
        int range = scanner.nextInt();

        Map<Integer, List<DinoDNA>> hashBuckets = new HashMap<>();
        int total = 0, collisions = 0;

        // 🔬 Generate Dino DNA and collect hash collisions
        for (int x = 0; x < range; x++) {
            for (int y = 0; y < range; y++){
                DinoDNA dino = new DinoDNA(x, y);
                int hash = dino.hashCode();
                hashBuckets.putIfAbsent(hash, new ArrayList<>());
                hashBuckets.get(hash).add(dino);
                total++;
            }
        }
        // 🔢 Histogram + Collision Count
        System.out.println("📊 Collision Report:");

        int maxCollision = 0;
        for (Map.Entry<Integer, List<DinoDNA>> entry : hashBuckets.entrySet()){
            int bucketSize = entry.getValue().size();

            if (bucketSize > 1) {
                collisions += bucketSize - 1;
                maxCollision = Math.max(maxCollision, bucketSize);
                System.out.println(" Hash " + entry.getKey() + "has " + bucketSize + " dinos: " + entry.getValue() );
            }
        }
        System.out.println("\n🧬 Total DNA samples: " + total);
        System.out.println("💥 Total Collisions: " + collisions);
        System.out.println("📉 Max in one hash: " + maxCollision);

        // 🗂 Export to CSV
        try(FileWriter writer = new FileWriter("collision.csv")) {
            writer.write("HashCode,NumOfDinos,Dinos\n");
            for (var entry : hashBuckets.entrySet()){
                if (entry.getValue().size() > 1) {
                    writer.write(entry.getKey()+ "," + entry.getValue().size() + ",\"" + entry.getValue() + "\"\n");
                }
            }
            System.out.println("\n✅ CSV Exported to collisions.csv");
        } catch (IOException e){
            System.out.println("❌ Failed to write CSV: " +e.getMessage());
        }

    }
}
