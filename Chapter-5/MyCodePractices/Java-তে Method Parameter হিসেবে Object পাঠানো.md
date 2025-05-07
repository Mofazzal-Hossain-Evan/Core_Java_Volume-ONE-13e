📘 Java-তে Method Parameter হিসেবে Object পাঠানো - সহজ ভাষায়
=============================================================

* * *

❓ প্রশ্ন:
---------

> যখন আমরা Java-তে কোনো class-এর instance (object) মেথডে প্যারামিটার হিসেবে পাঠাই, তখন আসলে কী পাঠানো হয়?

* * *

✨ উত্তর:
--------

**আমরা পুরো অবজেক্ট (instance) পাঠাই না।** আমরা পাঠাই **ওই অবজেক্টের রেফারেন্স** — মানে তার মেমোরি ঠিকানা (address)।

* * *

🔥 বাস্তব ঘটনা:
---------------

* যখন তুমি `BingeMode` বা অন্য কোনো অবজেক্ট মেথডে পাঠাও,

* তখন Java ওই অবজেক্টের **reference (address)** মেথডে পাঠায়,

* তাই মেথডের ভেতর থেকে তুমি আসল অবজেক্টের সাথে কাজ করতে পারো।

* * *

🧠 উদাহরণ:
----------

    public class TestBinge {
        public static void printMode(BingeMode mode) {
            System.out.println("Selected mode: " + mode);
        }
    
        public static void main(String[] args) {
            BingeMode myMode = BingeMode.RELAXED;
            printMode(myMode);  // এখানে myMode-এর রেফারেন্স পাঠানো হচ্ছে
        }
    }
    
    enum BingeMode {
        EXTREME, RELAXED, CASUAL;
    }

* * *

📦 সংক্ষেপে টেবিল:
------------------

| বিষয়                        | ব্যাখ্যা                      |
| ---------------------------- | ----------------------------- |
| অবজেক্ট কি পুরোটা কপি হয়?   | ❌ না                          |
| কী পাঠানো হয়?               | ✅ অবজেক্টের মেমোরি রেফারেন্স  |
| মেথডে আসল অবজেক্ট দেখা যায়? | ✅ হ্যাঁ                       |
| অবজেক্ট পরিবর্তন করা যায়?   | ✅ যদি অবজেক্ট ইমিউটেবল না হয় |

* * *

🚀 আরো উদাহরণ: Object Modify করা
--------------------------------

    public class Person {
        String name;
    
        Person(String name) {
            this.name = name;
        }
    
        public static void changeName(Person p) {
            p.name = "Changed Name"; // রেফারেন্স ধরে নাম পরিবর্তন
        }
    
        public static void main(String[] args) {
            Person person = new Person("Original Name");
            System.out.println("Before: " + person.name);
    
            changeName(person); // রেফারেন্স পাঠানো হলো
    
            System.out.println("After: " + person.name);
        }
    }

### 🧩 Output:

    Before: Original Name
    After: Changed Name

> এখানে প্রমাণিত হলো — আমরা reference পাঠাই, তাই আসল অবজেক্টে পরিবর্তন হয়!

* * *

⚡ কিছু টিপস:
------------

* Primitive types (int, float) পাঠালে value কপি হয়

* Object পাঠালে reference পাঠানো হয়

* Enum সাধারনত immutable হয় — তাই তাদের স্টেট পরিবর্তন করা যায় না

* * *

🔚 শেষ কথা:
===========

Java-তে **Object parameters মানে হলো Reference passing**। এটা জানলে অবজেক্ট ম্যানিপুলেশন অনেক সহজ হয়ে যায়।

সবকিছুই মনে রাখো:

> অবজেক্ট পাঠাও মানেই আসলে তার "ঠিকানা" পাঠাও! 🏠

চলো আরো চর্চা করি! 🚀
