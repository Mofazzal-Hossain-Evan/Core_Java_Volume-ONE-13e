
# 🛡️ Java Pattern Matching with Guards (in Bangla)

## 🔰 Guard কী?
Guard মানে হলো – `when` কিওয়ার্ড ব্যবহার করে তুমি **extra condition** বসাতে পারো কোনো `case`-এ।  
যদি সেই শর্ত (condition) পূরণ না হয়, তাহলে ঐ `case` কাজ করবে না – পরের case পরীক্ষা করা হবে।

---

## 🧪 উদাহরণ ১: Class Pattern-এ Guard

```java
case Executive exec when exec.getTitle().getLength() >= 20 ->
    "An executive with an impressive title";
```

### ব্যাখ্যা:
- `Executive` নামের class ধরেছে।
- কিন্তু `when` শর্ত দিয়েছে: `exec.getTitle().getLength() >= 20`  
- মানে, title-এর length ২০ বা তার বেশি না হলে, এই case কাজ করবে না।

---

## 🧪 উদাহরণ ২: Record Pattern + Guard

```java
record Point(int x, int y) {}

Point p = ...;
String description = switch (p) {
    case Point(var x, var y) when x == 0 && y == 0 -> "origin";
    case Point(var x, var __) when x == 0 -> "on x-axis";
    case Point(var __, var y) when y == 0 -> "on y-axis";
    default -> "not on either axis";
};
```

### ব্যাখ্যা:
- প্রথম case: x এবং y দুটোই 0 হলে → "origin"
- দ্বিতীয় case: শুধু x==0 → "on x-axis"
- তৃতীয় case: শুধু y==0 → "on y-axis"
- না হলে → default message

> এখানে `var __` ব্যবহার করা হয়েছে মানে ওই ভ্যারিয়েবল দরকার নেই – just ignore.

---

## ⚠️ যদি `when`-এ Exception হয়?
- তখন পুরো switch expression থেকে exception ছুঁড়ে দেওয়া হবে।
- যেমন, যদি `exec.getTitle()` `null` হয় এবং `getLength()` করতে গেলে `NullPointerException` হয়, তাহলে switch থেমে যাবে।

---

## 💡 উপকারিতা
- আরও নির্দিষ্টভাবে control করতে পারো কোন case active হবে।
- অনেক সময় nested if না লিখেও সহজভাবে switch handle করা যায়।
