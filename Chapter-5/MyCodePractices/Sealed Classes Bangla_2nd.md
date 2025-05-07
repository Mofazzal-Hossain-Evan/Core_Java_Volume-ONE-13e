Sealed Classes - সম্পূর্ণ ব্যাখ্যা
==================================

✅ সাধারণ ধারণা:
---------------

* `final` ক্লাস হলে কেউ তার subclass বানাতে পারে না।

* কিন্তু abstract বা সাধারণার ক্লাস হলে সবাই subclass বানানো যায়।

* যদি শুধু কন্ঠা কারার সাধনে চাই কারা সা subclass বানাবে পারবে সেটা নির্ধারণ করবো।

তাই Java 15-এ preview feature হিসেবে এবং Java 17-এ final feature হিসেবে `sealed classes` এসেছে।

* * *

✅ উদাহরণ সমস্যা (JSON Library):
-------------------------------

* JSON value = 6টি ধরণ: array, number, string, boolean, object, null

* `JSONValue` = abstract class

* Subclasses: `JSONArray`, `JSONNumber`, `JSONString`, `JSONBoolean`, `JSONObject`, `JSONNull`

### সমস্যাসমাধান ছাড়া:

    public abstract sealed class JSONValue
       permits JSONArray, JSONNumber, JSONString, JSONBoolean, JSONObject, JSONNull
    {
       // Common methods
    }

* `sealed` = permits থাকা দেওয়া ক্লাসগুলো subclass হতে পারবে

* অন্যা্য কেউ subclass বানাতে পারবে না

* * *

✅ Extra Rule:
-------------

* Permitted subclass এসে Accessible হতে হবে (private হলে চলবে না)

* Same package বা মোডুলে থাকা

* permits ক্লজ না দিলে subclass কে একী ফাইলে রাখতে হবে

* * *

✅ Compiler Advantage:
---------------------

* Compiler সব subclass সম্পর্কে জানে

* switch-case এ দেফোল্ট ছাড়ার ছাড়ার দরকার চেক করা যায়

    public String type()
    {
       return switch (this)
       {
          case JSONArray __ -> "array";
          case JSONNumber __ -> "number";
          case JSONString __ -> "string";
          case JSONBoolean __ -> "boolean";
          case JSONObject __ -> "object";
          case JSONNull __ -> "null";
       };
    }

* * *

✅ OOP এর দৃষ্টিকোণ:
-------------------

* Subclass গুলো override করুক এটা চাৱা

* Fixed set subclass থাকে one place এ মেনেজ লেখা সুবিধাজঞ্চক

* * *

✅ Subclass করতে গেলে:
---------------------

* sealed

* final

* non-sealed

### উদাহরণ:

    public abstract sealed class JSONValue permits JSONObject, JSONArray, JSONPrimitive { }
    
    public abstract sealed class JSONPrimitive extends JSONValue
          permits JSONString, JSONNumber, JSONBoolean, JSONNull { }

* * *

✅ নতুন শব্দ: non-sealed
-----------------------

* non-sealed = subclass বানানো যাবে

### উদাহরণ (XML Node Structure):

    public abstract sealed class Node permits Element, Text, Comment, CDATASection, EntityReference, ProcessingInstruction { }
    
    public non-sealed class Element extends Node { }
    
    public class HTMLDivElement extends Element { } // Allowed

* Hyphen যুক্ত non-sealed কিয়ে করার কারণ future-proof

* * *

✅ ছোট রিভিজন টেবিল:
-------------------

| Term           | ব্যাখ্যা                                      |
| -------------- | --------------------------------------------- |
| sealed         | নির্দিষ্ট subclass ছাড়ার অন্য কেউ subclass না |
| permits        | কারা subclass হবে তার লিস্ট                   |
| final          | আর subclass করা যাবে না                       |
| non-sealed     | নতুন subclass বানানো                          |
| default clause | সব case কভার করলে default লাগবে না            |

* * *

✅ Example Code বিশ্লেষণ (SealedTest.java)
=========================================

1. **Interface:**

    sealed interface JSONValue permits JSONArray, JSONObject, JSONPrimitive
    {
       public default String type()
       {
          if (this instanceof JSONArray) return "array";
          else if (this instanceof JSONObject) return "object";
          else if (this instanceof JSONNumber) return "number";
          else if (this instanceof JSONString) return "string";
          else if (this instanceof JSONBoolean) return "boolean";
          else return "null";
       }
    }

2. **JSONArray:**

    final class JSONArray extends ArrayList<JSONValue> implements JSONValue { }

3. **JSONObject:**

    final class JSONObject extends HashMap<String, JSONValue> implements JSONValue
    {
       public String toString()
       {
          // Key-value সুনদর ফরম্যাটে প্রিন্ট করা
       }
    }

4. **JSONPrimitive (Sealed Interface):**

    sealed interface JSONPrimitive extends JSONValue
          permits JSONString, JSONNumber, JSONBoolean, JSONNull { }

5. **JSONNumber:**

    final record JSONNumber(double value) implements JSONPrimitive
    {
       public String toString() { return "" + value; }
    }

6. **JSONString:**

    final record JSONString(String value) implements JSONPrimitive
    {
       public String toString() { return "\"" + value.translateEscapes() + "\""; }
    }

7. **JSONBoolean:**

    enum JSONBoolean implements JSONPrimitive
    {
       FALSE, TRUE;
       public String toString() { return super.toString().toLowerCase(); }
    }

8. **JSONNull:**

    enum JSONNull implements JSONPrimitive
    {
       INSTANCE;
       public String toString() { return "null"; }
    }

9. **Main Class:**

    public class SealedTest
    {
       public static void main(String[] args)
       {
          JSONObject obj = new JSONObject();
          obj.put("name", new JSONString("Harry"));
          obj.put("salary", new JSONNumber(90000));
          obj.put("married", JSONBoolean.FALSE);
    
          JSONArray arr = new JSONArray();
          arr.add(new JSONNumber(13));
          arr.add(JSONNull.INSTANCE);
    
          obj.put("luckyNumbers", arr);
    
          System.out.println(obj); // Full JSON object
          System.out.println(obj.type()); // "object"
       }
    }

* * *

🔥 শেষ কথা:
===========

* Sealed classes/interfaces হেরাচি শুনিত সা subclass ছাড়ার বাহিরে নিয়ন্ত্রণ করেয়।

* Compiler exhaustive checking করতে পারেবে।

* ভবিষ্যতে Java-তে hyphen keyword আরো আসে দেখা যেতে পারে!
