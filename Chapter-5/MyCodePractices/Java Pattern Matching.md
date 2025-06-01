# **Java 16 এবং Java 21-এ Pattern Matching ও Record Pattern নিয়ে বিস্তারিত আলোচনা**

Java 16 এবং পরবর্তী সংস্করণে `instanceof` অপারেটর আরও সুবিধাজনকভাবে ব্যবহার করা যায় **Pattern Matching** পদ্ধতির মাধ্যমে। এছাড়া, Java 21-এ **Record Pattern** যুক্ত হয়েছে, যা Record Type-এর সাথে আরও সহজ এবং কার্যকর কোড লেখার সুযোগ দেয়। এই আলোচনায় আমরা একে একে সব দিক ব্যাখ্যা করবো।

---

## **১. `instanceof` অপারেটরের পুরনো ও নতুন স্টাইল**

আগে যখন `instanceof` ব্যবহার করা হতো, তখন কাস্টিং প্রয়োজন হতো, যা কোডকে অপ্রয়োজনীয়ভাবে দীর্ঘ করত। যেমনঃ

```java
if (staff[i] instanceof Manager) {
   Manager boss = (Manager) staff[i];  // একই ক্লাসের নাম তিনবার ব্যবহার হয়েছে
   boss.setBonus(5000);
}
```

এটি বেশ **verbose**, কারণ আমরা **Manager** ক্লাসের নাম তিনবার ব্যবহার করেছি।

### **✅ নতুন স্টাইল (Java 16 থেকে)**
Java 16 থেকে এই কোডটি আরও সংক্ষিপ্তভাবে লেখা যায়ঃ

```java
if (staff[i] instanceof Manager boss) {
   boss.setBonus(5000);
}
```

এখানে `staff[i]` যদি **Manager** হয়, তাহলে **boss** নামে একটি লোকাল ভেরিয়েবল সেট হবে, যা আমরা সরাসরি ব্যবহার করতে পারবো। আর যদি `staff[i]` **Manager** না হয়, তাহলে `instanceof` অপারেটর `false` রিটার্ন করবে এবং `if` ব্লকের কোড চলবে না।

---

## **২. ভুল এবং অপ্রয়োজনীয় `instanceof` চেক**
অনেক সময় এমন `instanceof` চেক লেখা হয় যা আসলে **অপ্রয়োজনীয়** এবং কম্পাইল-টাইম ত্রুটি তৈরি করে। যেমনঃ

```java
Manager boss = new Manager();
if (boss instanceof Employee e) {
   // ❌ ERROR: এটি ভুল, কারণ Manager নিজেই Employee এর সাবক্লাস।
}
```

এটি কম্পাইল-টাইম ত্রুটি দেবে, কারণ **Manager** ইতিমধ্যেই **Employee** এর সাবক্লাস, তাই এই চেকের দরকার নেই। তবে নিচের স্টাইলের চেক **চলবে**, কারণ এটি Java 1.0 থেকে **backward compatibility** বজায় রাখতে রাখা হয়েছে।

```java
if (boss instanceof Employee) {
   // ✅ এটি কাজ করবে, তবে অপ্রয়োজনীয়।
}
```

---

## **৩. `&&` এবং `||` এর সাথে Pattern Matching**
Pattern Matching যুক্ত `instanceof` ব্যবহার করে **&& (AND)** অপারেটরের সাথে ব্যবহার করা যায়, তবে **|| (OR)** এর সাথে কিছু সমস্যা হয়।

### **✅ `&&` এর সাথে সঠিক ব্যবহার**
```java
Employee e;
if (e instanceof Executive exec && exec.getTitle().length() >= 20) {
   // এখানে exec ব্যবহার করা যাবে
}
```

### **❌ `||` (OR) এর সাথে ভুল ব্যবহার**
```java
if (e instanceof Manager exec || exec.getTitle().length() >= 20) {
   // ❌ ERROR: যদি প্রথম শর্ত মিথ্যা হয়, তাহলে exec সেট হয়নি।
}
```

---

## **৪. `instanceof` এবং `? :` (টেরনারি অপারেটর)**
```java
String title = e instanceof Executive exec ? exec.getTitle() : "";
```

---

## **৫. Shadowing: লোকাল ভেরিয়েবল বনাম ফিল্ড ভেরিয়েবল**
```java
class Value {
   private double v;
   public boolean equals(Object other) {
      if (other instanceof Value v) {
         // এখানে v হল লোকাল ভেরিয়েবল
      } else {
         // এখানে v হল ক্লাস ফিল্ড
      }
   }
}
```

---

## **৬. Java 21-এ `Record Pattern` (Record টাইপের সাথে Pattern Matching)**
```java
record Point(double x, double y) {}
Point p = new Point(3, 4);

if (p instanceof Point(var a, var b)) {
   double distance = Math.hypot(a, b);
}
```

---

## **৭. Nested Record Pattern**
```java
record Circle(Point center, double radius) {}
Circle c = new Circle(new Point(3, 4), 5);

if (c instanceof Circle(Point(var a, var b), var r)) {
   System.out.println("Center: (" + a + ", " + b + "), Radius: " + r);
}
```

---

## **৮. Java 21-এর `Unnamed Variables` (JEP 443)**
```java
if (p instanceof Point(var a, _)) {
   double distance = Math.abs(a);
}
```

**❗ এটি Java 21-এর একটি "preview feature"। যদি এটি এখন ব্যবহার করতে হয়, তাহলে `_` এর বদলে `var __` (ডাবল আন্ডারস্কোর) ব্যবহার করতে হবে।**

---

## **🔹 উপসংহার**
1. Java 16 থেকে **Pattern Matching** যুক্ত `instanceof` ব্যবহার করলে **কোড ছোট ও পরিষ্কার** হয়।
2. **`&&` অপারেটরের সাথে কাজ করে, কিন্তু `||` এর সাথে সমস্যা হয়।**
3. **Record Pattern (Java 21)** ব্যবহার করে **record type-এর ফিল্ডগুলো সরাসরি অ্যাক্সেস করা যায়**।
4. **Unnamed Variables** দিয়ে **অপ্রয়োজনীয় ফিল্ড বাদ দেওয়া যায়।**

এগুলি Java-র নতুন ও উন্নত ফিচার, যা কোডকে সহজ করে তোলে এবং **better readability ও maintainability** নিশ্চিত করে। 🚀
