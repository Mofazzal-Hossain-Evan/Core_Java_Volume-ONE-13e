# **Java-তে Record কনসেপ্ট: একটি সম্পূর্ণ আলোচনা**

## **1. রেকর্ড কী?**
Java-তে **Record** হলো একটি বিশেষ ধরনের ক্লাস, যার অবস্থা (**state**) অপরিবর্তনীয় (**immutable**) এবং পাবলিকলি রিডেবল (**readable by the public**)। সহজ ভাষায়, রেকর্ড হলো এমন এক ধরনের ক্লাস, যা শুধুমাত্র ডাটা ধারণ করে এবং সেই ডাটাকে পরিবর্তন করা যায় না।

উদাহরণস্বরূপ, নিচের **Point** রেকর্ডটি দেখুন:
```java
record Point(double x, double y) { }
```
এই কোডটি লেখার ফলে, Java স্বয়ংক্রিয়ভাবে নিচের কাজগুলো করে দেয়—
1. **private final** ইনস্ট্যান্স ফিল্ড তৈরি করে:
   ```java
   private final double x;
   private final double y;
   ```
2. **একটি কনস্ট্রাক্টর তৈরি করে**
   ```java
   Point(double x, double y) { }
   ```
3. **অ্যাক্সেসর মেথড (getter) তৈরি করে**
   ```java
   public double x() { return x; }
   public double y() { return y; }
   ```

> **বিঃদ্রঃ** এখানে `x()` এবং `y()` মেথডগুলোর নাম `getX()` বা `getY()` নয়। কারণ Java-এর রেকর্ডগুলো ঐতিহ্যবাহী **getter naming convention** অনুসরণ করে না, যা কিছু ক্ষেত্রে ঝামেলা সৃষ্টি করতে পারে।

## **2. রেকর্ড ব্যবহারের সহজ উদাহরণ**
```java
var p = new Point(3, 4);
System.out.println(p.x() + " " + p.y()); // আউটপুট: 3 4
```
এখানে `p.x()` এবং `p.y()` মেথড ব্যবহার করে সহজেই ডাটা রিড করা যাচ্ছে।

---

## **3. কেন Java-তে getter মেথডের নাম আলাদা?**
সাধারণত, Java-তে getter মেথডের নাম `getFieldName()` হয়। তবে, রেকর্ডে সরাসরি ফিল্ডের নামটাই অ্যাক্সেসর মেথডের নাম হিসেবে ব্যবহৃত হয়।

কারণ:
- **Boolean ফিল্ডের ক্ষেত্রে** `isFieldName()` ব্যবহৃত হয়, যা জটিলতা সৃষ্টি করতে পারে।
- **ক্ষেত্র সংবেদনশীলতা** (case sensitivity) সমস্যা হয়, যেমন `x` এবং `X` আলাদা ফিল্ড হলে নামকরণে দ্বন্দ্ব হতে পারে।
- অনেক পুরনো **mutable ক্লাসগুলো রেকর্ডে সহজে পরিবর্তন করা সম্ভব নয়।**

---

## **4. রেকর্ডের স্বয়ংক্রিয় মেথড: toString, equals, hashCode**
প্রতিটি রেকর্ডে নিম্নলিখিত **তিনটি মেথড** স্বয়ংক্রিয়ভাবে তৈরি হয়:
1. **toString()** - রেকর্ডের ডাটা প্রিন্ট করার জন্য
2. **equals()** - দুটি রেকর্ড অবজেক্ট সমান কিনা তা যাচাই করার জন্য
3. **hashCode()** - হ্যাশ কোড জেনারেট করার জন্য

---

## **5. কাস্টম মেথড সংযোজন করা সম্ভব**
আপনি চাইলে রেকর্ডের মধ্যে **নিজস্ব মেথড** সংযোজন করতে পারেন।

উদাহরণস্বরূপ, **distanceFromOrigin()** নামের একটি মেথড যোগ করা হলো:
```java
record Point(double x, double y) {
    public double distanceFromOrigin() {
        return Math.hypot(x, y);
    }
}
```
এটি পয়েন্টের (0,0) থেকে কত দূরে আছে তা গণনা করবে।

---

## **6. স্ট্যাটিক ফিল্ড এবং মেথড সংযোজন করা সম্ভব**
যেহেতু রেকর্ড একটি ক্লাসের মতো কাজ করে, তাই আমরা **static fields এবং static methods** সংযোজন করতে পারি।

```java
record Point(double x, double y) {
    public static Point ORIGIN = new Point(0, 0);

    public static double distance(Point p, Point q) {
        return Math.hypot(p.x - q.x, p.y - q.y);
    }
}
```
---

## **7. কেন রেকর্ডে নতুন ফিল্ড যোগ করা যায় না?**
রেকর্ডের মূল উদ্দেশ্য হলো **immutable data carrier** তৈরি করা। তাই, নতুন **ইনস্ট্যান্স ফিল্ড** সংযোজন করা যাবে না।

যেমন নিচের কোডটি **এরর** দিবে:
```java
record Point(double x, double y) {
    private double r; // ERROR
}
```

---

## **8. রেকর্ডের Mutable অবস্থা: সতর্কতা**
যদিও রেকর্ডের **ফিল্ডগুলো final**, তবে যদি কোনো **mutable object** সংযুক্ত থাকে, তাহলে এটি পরিবর্তনযোগ্য হতে পারে।

```java
record PointInTime(double x, double y, Date when) { }
```
এখন, যদি আমরা `PointInTime` অবজেক্ট তৈরি করি, তখন `Date` পরিবর্তনযোগ্য হতে পারে:
```java
var pt = new PointInTime(0, 0, new Date());
pt.when().setTime(0); // ফিল্ড পরিবর্তন করা সম্ভব!
```
এজন্য, **immutable রেকর্ড তৈরি করতে mutable object ফিল্ড এড়িয়ে চলুন।**

---

## **9. কখন রেকর্ড ব্যবহার করবেন?**
✅ **রেকর্ড ব্যবহার করুন যদি:**
- ডাটা অপরিবর্তনীয় (**immutable**) হয়।
- ক্লাসটি শুধুমাত্র ভ্যালু ধারণ করার জন্য ব্যবহার হয়।
- একাধিক থ্রেডে নিরাপদভাবে ব্যবহার করতে হয় (**Thread-Safe**)।
- সহজ ও কার্যকর **toString, equals, hashCode** মেথড দরকার হয়।

❌ **রেকর্ড ব্যবহার করবেন না যদি:**
- ডাটা পরিবর্তনযোগ্য (**mutable**) হয়।
- ভবিষ্যতে নতুন ফিল্ড সংযোজন করতে হতে পারে।
- ক্লাসের লজিক জটিল হয়।

---

## **শেষ কথা**
Java-তে **Record** হলো immutable data ক্লাস তৈরির একটি সহজ ও কার্যকর পদ্ধতি। এটি **বেশি নিরাপদ, সহজে পড়া যায়, এবং পারফরম্যান্স-উন্নত** করে। তবে, Mutable অবজেক্ট সংযোজন করলে রেকর্ডের মূল ধারণা ব্যাহত হতে পারে। তাই, **Immutable Data Model** তৈরি করতে চাইলে রেকর্ড ব্যবহার করা ভালো অভ্যাস। 🚀
