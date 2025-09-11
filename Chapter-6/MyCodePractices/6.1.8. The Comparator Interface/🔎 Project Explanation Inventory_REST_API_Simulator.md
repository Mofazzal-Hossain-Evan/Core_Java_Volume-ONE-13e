
# Inventory_REST_API_Simulator

# 🔎 Project Explanation (Programmer’s Perspective)

## 1. Purpose of the Project

এই প্রজেক্টটা আসলে একটা **REST API Simulation** – তবে আসল ওয়েব API ছাড়াই।
👉 আমরা কনসোলে আউটপুট দিচ্ছি JSON-এর মতো ফরম্যাটে।
👉 এর মাধ্যমে বোঝানো হয়েছে, কীভাবে ডেটা **Comparator দিয়ে sort** করে, REST response-এর মতো সাজানো যায়।

---

## 2. Classes Overview

### 🧩 `Item`

* Represents a **data model** (একটা Product/Inventory item)
* Fields: `name`, `price`, `stockQuantity`
* Has a **constructor** + **getters**
* Overrides `toString()` → JSON-like output

👉 একদম API-এর **model class** এর মতো কাজ করছে।

---

### 🧩 `PriceComparator`

* Implements `Comparator<Item>`
* Defines sorting rule: **ascending order by price**
* Uses `Double.compare` for safe numeric comparison.

👉 এর মাধ্যমে আমরা বলছি, "API response-এ ডেটা **price অনুযায়ী sort করা হোক**।"

---

### 🧩 `StockComparator`

* Implements `Comparator<Item>`
* Defines sorting rule: **descending order by stock quantity**
* Uses `Integer.compare(i2, i1)` → reverse order

👉 এর মাধ্যমে আমরা বলছি, "API response-এ ডেটা **stock অনুযায়ী সাজানো হোক**।"

---

### 🧩 `InventorySimulator` (Main Class)

* Acts like the **Controller/Entry Point**
* Creates some **quirky Item objects** ("Magic Code Wand", "Time Travel Watch" ইত্যাদি 😃)
* Prints the original array (unsorted inventory)
* Then sorts twice:

    1. By price → simulates `GET /inventory?sort=price`
    2. By stock → simulates `GET /inventory?sort=stock`

👉 আউটপুটটা JSON-এর মতো, যাতে মনে হয় **Spring Boot REST response**।

---

## 3. Flow of Execution

```
START
|
|-- Create Item objects (name, price, stock)
|
|-- Print original inventory (unsorted)
|
|-- Arrays.sort(items, new PriceComparator())
|   → Sort by price ascending
|   → Print JSON-like response
|
|-- Arrays.sort(items, new StockComparator())
|   → Sort by stock descending
|   → Print JSON-like response
|
END
```

---

## 4. Key Programming Concepts Practiced

✅ **Encapsulation** → Item class fields are private, accessed via getters
✅ **Custom Comparators** → Flexible sorting logic instead of `Comparable`
✅ **Overriding `toString()`** → JSON-like representation of objects
✅ **API Simulation** → Output looks like REST responses
✅ **Reusability** → Multiple comparators used without modifying `Item` class

---

## 5. Why This Matters for Programmers

* বাস্তব API ডেভেলপমেন্টে (Spring Boot, Node.js, Django), ডেটা response পাঠানোর আগে **sorting/filtering** করা লাগে।
* এখানে একই concept আমরা **Java console project** দিয়ে প্র্যাকটিস করছি।
* Comparator ব্যবহার করলে code থাকে **flexible** → চাইলে আরও custom comparator বানাতে পারবেন (e.g., sort by name)।

---

👉 এক কথায়:
এই প্রজেক্টটা একটা **mini simulation of API backend logic** – যেখানে আপনি inventory data নিয়ে কাজ করছেন, sorting rules apply করছেন, আর JSON-এর মতো format-এ response পাচ্ছেন।

---

আপনি চাইলে আমি এখন এর একটা **pseudo-REST API request/response flow** লিখে দিতে পারি, যাতে beginner দের জন্য বোঝা আরও সহজ হয়।

চাইবেন কি আমি pseudo-API flow (যেমন `GET /inventory?sort=price`) লিখে দিই?
