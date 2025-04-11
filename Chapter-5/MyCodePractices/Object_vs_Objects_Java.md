
# 🔍 Difference Between `Object` and `Objects` in Java

Java-তে `Object` এবং `Objects` দেখতে একই রকম হলেও, ওদের কাজ এবং উদ্দেশ্য একেবারে ভিন্ন। এই ডকুমেন্টে আমরা সংক্ষিপ্ত এবং বিস্তারিতভাবে এই দুইটি ক্লাসের পার্থক্য দেখবো।

---

## 🔹 `java.lang.Object` (সিঙ্গুলার — "Object")

👉 Java-র **base class**।  
👉 প্রতিটি ক্লাস সরাসরি বা ইনডিরেক্টলি `Object` class extend করে।

### এই ক্লাসে পাওয়া যায়:
- `equals()`
- `hashCode()`
- `toString()`
- `getClass()`
- `clone()`
- ইত্যাদি...

#### উদাহরণ:
```java
Object obj = new String("Hello");
System.out.println(obj.toString());  // "Hello"
```

---

## 🔸 `java.util.Objects` (প্লুরাল — "Objects")

👉 Java 7-এ আসা **utility class**।  
👉 Null-safe মেথড দেয়, যেমন:

### গুরুত্বপূর্ণ মেথড:
- `Objects.equals(a, b)` → null-safe equals চেক
- `Objects.hash(a, b, c...)` → hashCode তৈরি করে
- `Objects.requireNonNull(x)` → null হলে exception
- `Objects.toString(x)` → null হলে "null" রিটার্ন

#### উদাহরণ:
```java
Objects.equals(name, other.name); // null-safe equals
Objects.hash(name, id); // hashCode combine করে
```

---

## ✅ সংক্ষিপ্ত পার্থক্য:

| বিষয় | `Object` | `Objects` |
|------|----------|-----------|
| প্যাকেজ | `java.lang` | `java.util` |
| টাইপ | Base class | Utility/helper class |
| ব্যবহৃত হয় | Inheritance, base functionality | Null-safe operations |
| প্রধান কাজ | Base মেথড define | Utility মেথড provide করা |
| Introduced in | Java 1.0 | Java 7 |

---

## 🤔 কেন `Objects.equals()` ব্যবহার করব?
```java
Objects.equals(name, other.name);
```
➡️ এটা **null-safe**।  
➡️ যদি `name` বা `other.name` null হয়, `false` দিবে, কিন্তু **NullPointerException** দেবে না।

---

Happy Coding! ☕💻
