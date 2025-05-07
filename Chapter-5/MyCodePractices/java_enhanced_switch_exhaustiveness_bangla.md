
# ✅ Java Enhanced Switch Exhaustiveness (বাংলা ব্যাখ্যা)

## 🔶 ১. switch expression-এ exhaustiveness বাধ্যতামূলক কেন?
Java-তে `switch expression` একটি value return করে। সেজন্য সব সম্ভাব্য selector value-র জন্য একটা `case` থাকা আবশ্যক—না হলে Java জানবে না কোনটা return করবে।

---

## 🔶 ২. Exhaustiveness নিশ্চিত করার উপায়গুলো

একটা switch expression exhaustive হয় যদি—

### ✅ enum এর সব instance-এর জন্য case থাকে
```java
enum Day { MON, TUE }

String msg = switch(day) {
    case MON -> "Monday";
    case TUE -> "Tuesday";
};
```

### ✅ sealed type হলে তার সব subclass unguarded case হিসেবে থাকলে
```java
sealed interface Animal permits Cat, Dog {}
final class Cat implements Animal {}
final class Dog implements Animal {}

String sound = switch (animal) {
    case Cat c -> "Meow";
    case Dog d -> "Woof";
};
```

### ✅ একটা unguarded pattern দিয়েই পুরো selector টাইপটা কভার করা যায়
```java
String result = switch(obj) {
    case String s -> s.toUpperCase(); // Covers all Strings
};
```

### ✅ default case থাকলে
```java
String result = switch(obj) {
    case String s -> s.toUpperCase();
    default -> "Unknown";
};
```

---

## 🔶 ৩. Guarded pattern দিয়ে exhaustiveness বোঝা যায় না

```java
case Executive exec when exec.getTitle().length() >= 20 -> ...
case Executive exec when exec.getTitle().length() < 20 -> ...
```
এগুলো **guarded pattern**, এবং কম্পাইলার এগুলোর ভিত্তিতে "সব কভার হয়েছে" তা ধরতে পারে না।

তাই rewrite করতে হয়:
```java
case Executive exec -> ...
```
অথবা
```java
default -> ...
```

---

## 🔶 ৪. Sealed class বা enum পরিবর্তিত হলে পূর্ববর্তী switch non-exhaustive হয়ে যেতে পারে

যেমনঃ নতুন subclass বা enum constant যোগ করলে আগের exhaustive switch আর কাজ করবে না।

---

## 🔶 ৫. Classic switch statement exhaustive না হলেও চলে

```java
switch(value) {
   case 1 -> ...
   // no default = allowed (for classic)
}
```
কিন্তু **enhanced switch** হলে অবশ্যই exhaustive হতে হবে।

---

## 🔶 ৬. Enhanced switch statement কী কী?

যখন `switch`:
- pattern matching করে,
- `case null` থাকে,
- বা selector এর type primitive/enum/String না হয়ে object বা sealed type হয়।

এই ধরনের switch কে **enhanced switch** বলে এবং এটায় **exhaustiveness বাধ্যতামূলক**।

---

## 🔶 ৭. "আমি কিছুই করব না" এমন case চাইলে?

```java
default -> {}       // No action
// অথবা
default: break;     // Works in classic switch
```

---

## 🔶 ৮. null value exhaustiveness চেকের বাইরে

```java
String s = switch(str) {
    case null -> "Null";
    case String st -> st;
};
```
এভাবে `case null` দিলে সমস্যা নেই, কিন্তু null case না দিলেও compile হয়। কারণ **null চেক exhaustiveness-এর অংশ না**।

কিন্তু run-time-এ null আসলে:
- NullPointerException হয়, অথবা
- MatchException হয় (যদি pattern না মেলে)

---

## 🔶 ৯. Nested record pattern এ null সমস্যা

```java
record Box<T>(T contents) {}

Box<Box<String>> doubleBoxed = ...;

String s = switch (doubleBoxed) {
    case Box(Box(String str)) -> str;
};
```

### বিভিন্ন ক্ষেত্রে:
- `doubleBoxed = new Box<>(null)` → MatchException হবে
- `doubleBoxed = null` → NullPointerException হবে
- `doubleBoxed = new Box<>(new Box<>(null))` → `str = null`, return ঠিকঠাক

**null case ধরতে চাইলে:**
```java
case Box(b) when b == null -> ...
```
কিন্তু এটাও **guarded pattern**, তাই **exhaustiveness-এর অংশ না**।
