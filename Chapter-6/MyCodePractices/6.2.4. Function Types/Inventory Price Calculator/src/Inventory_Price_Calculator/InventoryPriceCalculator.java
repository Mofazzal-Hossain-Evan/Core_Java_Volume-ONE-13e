/* Package declaration */
package Inventory_Price_Calculator;

import java.util.*;
import java.util.function.*;

/* থিয়রি: *Core Java* (p. 274) — BiFunction গণনার জন্য, Predicate ফিল্টারিং-এ, Supplier ডিফল্টের জন্য। */

public class InventoryPriceCalculator {
    public static void main(String[] args) {
        // ১. দাম ক্যালকুলেটর (BiFunction)
        BiFunction<Double, Double, Double> priceCalculator =
                (base, discount) -> base * (1 - discount);

        // ২. আইটেম জেনারেটর (IntFunction)
        Random random = new Random();
        IntFunction<Item> itemGenerator =
                id -> new Item("Gizmo #" + id, id * 12.0, random.nextDouble() * 0.4);

        // ৩. ইনভেন্টরি তৈরি
        List<Item> inventory = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            Item item = itemGenerator.apply(i);
            inventory.add(item);
        }

        // ৪. মজার আইটেম যোগ করা
        inventory.addAll(List.of(
                new Item("Discounted Bug Spray", 8.0, 0.5),
                new Item("Quantum Coffee Mug", 25.0, 0.1),
                new Item("Enchanted USB Drive", 60.0, 0.75) // 75% off!
        ));

        // ৫. সবার চূড়ান্ত দাম আপডেট
        for (Item item : inventory) {
            double finalPrice = priceCalculator.apply(item.getBasePrice(), item.getDiscountRate());
            item.setFinalPrice(finalPrice);
        }

        System.out.println("Initial Inventory:");
        inventory.forEach(System.out::println);
        System.out.println();

        // ৬. কম দামের আইটেম ফেলে দেওয়া (Predicate + removeIf)
        Predicate<Item> lowPrice = item -> item.getFinalPrice() < 5.0;
        inventory.removeIf(lowPrice);

        System.out.println("After removing items under $5:");
        inventory.forEach(System.out::println);
        System.out.println();

        // ৭. দাম অনুযায়ী সর্ট করা
        inventory.sort(Comparator.comparingDouble(Item::getFinalPrice));

        System.out.println("Sorted by Final Price:");
        inventory.forEach(System.out::println);
        System.out.println();

        // ৮. JEE ট্রানজেকশন সিমুলেশন — ডিফল্ট আইটেম
        Supplier<Item> defaultItem = () -> new Item("Emergency Widget", 10.0, 0.0);
        Item transactionItem = null; // ধরো, ডাটাবেস থেকে আসেনি
        Item safeItem = Objects.requireNonNullElseGet(transactionItem, defaultItem);
        safeItem.setFinalPrice(priceCalculator.apply(safeItem.getBasePrice(), safeItem.getDiscountRate()));

        System.out.println("Transaction Safe Item: " + safeItem);
    }
}