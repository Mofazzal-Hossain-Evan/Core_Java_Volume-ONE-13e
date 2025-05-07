📦 প্রজেক্টের নাম:
==================

**Mini JSON Model using Sealed Interface in Java**

* * *

🛠️ মূল আইডিয়া:
===============

আমরা **JSON** (ডেটা) Java-তে represent করবো,এবং **sealed interfaces** এবং **sealed classes** ব্যবহার করবো যেনে কেউন কে subclass হতে পারবে সেটা কনট্রোল করা যায়।

* * *

🌳 ক্লাসের গাছ (Hierarchy):
===========================

    JSONValue (sealed interface)
    ├── JSONArray (final class)
    ├── JSONObject (final class)
    └── JSONPrimitive (sealed interface)
        ├── JSONNumber (final record)
        ├── JSONString (final record)
        ├── JSONBoolean (enum)
        └── JSONNull (enum)

* * *

🔥 এখন প্রতিটা অংশ ব্যাখ্যা:
============================

### 1. `JSONValue` (sealed interface)

* মুল ইন্টারফেস, যেটা সব JSON টাইপ-এর parent হিসেবে কাজ করে।

* `type()` মেথড রয়েছে, যেটা JSON-ের টাইপ জানায়।

* `sealed` করা হয়েছে যেনো নির্ধিষ্টিত ক্লাসেরা ইমপ্লিমেন্ট করে।

### 2. `JSONArray` (final class)

* JSON এর array represent করে (list of JSONValue)।

* ArrayList কে extend করে এবং JSONValue implement করে।

* Final করা হয়েছে যেনো সাবকে বাদ করে নায়।

### 3. `JSONObject` (final class)

* JSON object (key-value pair) represent করে।

* HashMap extend করে এবং JSONValue implement করে।

* `toString()` override করে প্রপার JSON ফরমেট করে।

### 4. `JSONPrimitive` (sealed interface)

* Primitive টাইপের জন্য (string, number, boolean, null)।

* Sealed interface হিসেবে নির্ধিষ্ট কয়কে implement করা যাবে।

### 5. `JSONNumber` (record)

* JSON number represent করে।

* Record ব্যবহার করা হয়েছে immutable object করার জন্য্য।

### 6. `JSONString` (record)

* JSON string represent করে।

* Escape character মেনে সটিক JSON বানায়।

### 7. `JSONBoolean` (enum)

* JSON boolean (true/false) represent করে।

* Enum ব্যবহার করা হয়েছে fixed value থাকার জন্য্য।

### 8. `JSONNull` (enum)

* Null represent করার জন্য একটি instance (INSTANCE)।

* Enum দিয়ে টা fixed singleton হয়ে।

### 9. `SealedTest` (Main class)

* Main method যেখানে বড়ো JSON object তৈরি করা হয়েছে যেখানে নাম, salary, married status, lucky numbers আছে।

* * *

🌟 সংক্ষেপে:
============

> প্রত্যেক্টে sealed interfaces, sealed classes, final classes, records, enums দিয়ে modern Java (17+) feature ব্যবহার করে, JSON ডেটা structure মডেল করা হয়েছে।
