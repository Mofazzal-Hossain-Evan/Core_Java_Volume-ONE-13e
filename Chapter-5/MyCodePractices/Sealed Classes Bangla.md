Sealed Classes - সম্পূর্ণ ব্যাখ্যা
==================================

✅ সাধারণ ধারণা:
---------------

final ক্লাস হলে কেউ তার subclass বানাতে পারে না।

কিন্তু abstract বা সাধারণ ক্লাস হলে সবাই subclass বানাতে পারে।

কখনো কখনো আমরা চাই কন্ট্রোল রাখতে: কারা subclass বানাতে পারবে সেটা আমরা নির্ধারণ করবো।

এজন্য Java 15 এ preview feature হিসেবে এবং Java 17 এ final feature হিসেবে sealed classes এসেছে।
✅ উদাহরণ সমস্যা (JSON Library):
-------------------------------

JSON value মানে হলো 6টি ধরণ: array, number, string, boolean, object, null।

আমরা চাই:

JSONValue নামে এক abstract class হবে।

এরপর JSONArray, JSONNumber, JSONString, JSONBoolean, JSONObject, JSONNull — এগুলো হবে এর subclasses।

এগুলো final করে দিলেই এগুলোর further subclassing রোধ করা যায়।

কিন্তু কেউ চাইলে নতুন করে class JSONComment extends JSONValue বানিয়ে ফেলে পারে — এটা আটকানো যায় না।
✅ sealed class দিয়ে সমাধান:
---------------------------

    public abstract sealed class JSONValue
       permits JSONArray, JSONNumber, JSONString, JSONBoolean, JSONObject, JSONNull
    {
       // সবার জন্য কমন মেথড
    }

sealed মানে হলো: শুধু permits-এ দেওয়া ক্লাসগুলিও subclass হতে পারবে।

অন্য কেউ নতুন করে subclass বানাতে পারবে না।

যেমন:
    public class JSONComment extends JSONValue { } // ❌ Error
✅ Extra Rule:
-------------

Permitted subclasses:

* Accessible হতে হবে। (private হলে চলবে না)

* Same package বা same module-এ থাকতে হতে হবে

* permits ক্লজ না দিলে সব subclass একী ফাইলে থাকতে হবে

✅ Compiler Advantage:
---------------------

Compiler এখন জানতে পারে সবগুলো subclass এর কথা।

এজন্য switch-case এ আমরা দেফল্ট ছাড়াই exhaustiveness check করতে পারে।
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
✅ OOP এর দৃষ্টিকোণ:
-------------------

* Subclass গুলো override করুক মেথড থাকাতে চাই

* যদি fixed set থাকে, তাহলে একসাথে লিখা সুবিধাজনক

✅ Subclass করতে গেলে:
---------------------

sealed, final, অথবা non-sealed এর যেকটা দিতে হবে।

উদাহরণ:
    public abstract sealed class JSONValue permits JSONObject, JSONArray, JSONPrimitive { }

    public abstract sealed class JSONPrimitive extends JSONValue
          permits JSONString, JSONNumber, JSONBoolean, JSONNull { }
✅ নতুন শব্দ: non-sealed
-----------------------

non-sealed মানে হলো, subclass বানানোয়ার কোনো বাধা নেই।

উদাহরণ (XML Node structure):
    public abstract sealed class Node permits Element, Text, Comment, CDATASection, EntityReference, ProcessingInstruction { }

    public non-sealed class Element extends Node { }

    public class HTMLDivElement extends Element { } // Allowed
✅ non-sealed শব্দটি hyphen সহ কেন?
----------------------------------

Java আগে কখনো hyphen যুক্ত keyword দেনিনি।

future-proof করার জন্য এটা করা হয়েছে।

যেমন:
    int sealed = 1; // এখনো valid

non-sealed কখনো existing কোডের সাথে clash করবে না।
✅ ছোট রিভিশন টেবিল:
-------------------

| Term           | ব্যাখ্যা                                                    |
| -------------- | ----------------------------------------------------------- |
| sealed         | নির্দিষ্ট করা সাবক্লাস ছাড়া অন্য কেউ subclass করতে পারবে না |
| permits        | কারা subclass হবে সেটা list করা                             |
| final          | আর subclass করা যাবে না                                     |
| non-sealed     | নতুন subclass বানানোয়ার যোগ্য                               |
| default clause | সব case cover করলে switch-এ default লাগেবে না               |

✅ একটি Example কোড বিশ্লেষণ: (SealedTest.java)
----------------------------------------------

(তারপর full code example, class by class, পরবর লিখে দেবো)

* * *

🔥 **শেষ কথা:**

sealed classes/interfaces আমাদের class hierarchy safe করে।

কিছু নির্দিষ্ট subclass ছা
