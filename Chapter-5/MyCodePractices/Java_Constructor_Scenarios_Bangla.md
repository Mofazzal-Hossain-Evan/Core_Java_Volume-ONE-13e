📘 Java Constructor Behavior (Different Scenarios) - বাংলায় ব্যাখ্যা
====================================================================

* * *

🔵 Scenario 1: Field ও Parameter এর নাম আলাদা
---------------------------------------------

    public class Pen {
        private String color;
    
        public Pen(String shade) {
            this.color = shade; // আলাদা নাম, কোন সমস্যা নেই
        }
    }

**Java কীভাবে দেখে:**

* `this.color` → ফিল্ড `color`

* `shade` → প্যারামিটার

* * *

🔵 Scenario 2: Field ও Parameter এর নাম এক
------------------------------------------

    public class Pen {
        private String color;
    
        public Pen(String color) {
            this.color = color; // একই নাম, তাই `this` প্রয়োজনিয়
        }
    }

**Java কীভাবে দেখে:**

* প্যারামিটার অগরা প্রাথমিক

* `this.color` বললে ফিল্ড

* * *

🔵 Scenario 3: Mistake - `this` না দেয়া Assignment
--------------------------------------------------

    public class Pen {
        private String color;
    
        public Pen(String color) {
            color = color; // ❌ ভুল
        }
    }

**পরিণাম:**
    Pen p = new Pen("Blue");
    System.out.println(p.color); // Output: null

* * *

🔵 Scenario 4: Static Field ও Constructor
-----------------------------------------

    public class Pen {
        private static String color;
    
        public Pen(String color) {
            Pen.color = color; // সুঠি ক্লাস নাম দিয়ে
        }
    }

**Java কীভাবে দেখে:**

* Static field পূরো ক্লাসের সাথে জড়িত

* * *

🔵 Scenario 5: Default Constructor ও Custom Constructor একসাথে
--------------------------------------------------------------

    public class Pen {
        private String color;
    
        public Pen() {
            this.color = "Black";
        }
    
        public Pen(String color) {
            this.color = color;
        }
    }

**Java কীভাবে দেখে:**

* No-arg Constructor দিয়ে default value

* Parameterized Constructor দিয়ে provided value

* * *

🌟 উপসংহার:
===========

| অবস্থা                         | Java কী করে             |
| ------------------------------ | ----------------------- |
| Field vs Parameter আলাদা       | কোন সমস্যা নেই          |
| Field vs Parameter এক          | `this` প্রয়োজনিয়       |
| `this` না দিলে                 | Field null থেকে থাকবে   |
| Static Field                   | Class name দিয়ে access |
| Default অবং Custom Constructor | Flexibility বাড়ানো      |

* * *

🎓 Extra Practice Example
=========================

    public class Car {
        private String brand;
        private int year;
    
        public Car() {
            this("Unknown", 0);
        }
    
        public Car(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }
    
        public void display() {
            System.out.println("Brand: " + brand + ", Year: " + year);
        }
    }

**ব্যবহার:**
    Car c1 = new Car();
    c1.display(); // Brand: Unknown, Year: 0

    Car c2 = new Car("Toyota", 2021);
    c2.display(); // Brand: Toyota, Year: 2021

* * *

✅ এইভাবেই Java Constructor এর ভিন্ন ভিন্ন আচরণ বুঝে সুন্দর ও কার্যকর কোড লেখা সম্ভব! 🚀
=======================================================================================
