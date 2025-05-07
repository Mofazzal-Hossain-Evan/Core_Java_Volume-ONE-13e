
# ✅ Why `static` is Used in Java (Bangla Explanation)

---

## 🔹 `static` মানে কী?

Java-তে `static` কীওয়ার্ড মানে হলো মেথড বা ভ্যারিয়েবল **ক্লাসের সাথে সরাসরি যুক্ত**।  
এগুলো ব্যবহার করতে অবজেক্ট তৈরি করার দরকার হয় না।

---

## 🔹 আমাদের কোডে `static` কেন দরকার?

আমরা যখন এমন utility মেথড লিখি যেগুলো শুধু ইনপুট নেয় এবং প্রসেস করে আউটপুট দেয় (অবজেক্টের ভেতরের ডেটা ব্যবহার করে না), তখন এগুলো `static` হওয়াই ভালো।

```java
MathToolbox.sum(1.1, 2.2, 3.3); // ক্লাসের নাম দিয়েই কল করছি
```

এখানে কোনো অবজেক্ট বানানো হয়নি।

---

## 🔸 যদি `static` না দেই?

```java
public class MathToolbox {
    public double sum(double... values) {
        // ...
    }
}
```

তাহলে কল করতে হবে এভাবে:

```java
MathToolbox toolbox = new MathToolbox();
toolbox.sum(1.1, 2.2, 3.3);
```

---

## 🔹 তুলনা: `static` vs `non-static`

| বিষয় | `static` | `non-static` |
|------|----------|---------------|
| অবজেক্ট ছাড়া কল করা যায়? | ✅ হ্যাঁ | ❌ না |
| ইনস্ট্যান্স ফিল্ড ব্যবহার করা যায়? | ❌ না | ✅ হ্যাঁ |
| Utility/helper মেথডে উপযুক্ত? | ✅ হ্যাঁ | ❌ না |
| অবজেক্টের অবস্থা দরকার হলে? | ❌ না | ✅ হ্যাঁ |

---

## 🔹 উদাহরণ: Static version

```java
public class MathToolbox {
    public static double sum(double... values) {
        double total = 0;
        for (double v : values) total += v;
        return total;
    }
}
```

```java
// ব্যবহার:
MathToolbox.sum(10, 20, 30);
```

---

## 🔹 উদাহরণ: Non-static version

```java
public class MathToolbox {
    public double sum(double... values) {
        double total = 0;
        for (double v : values) total += v;
        return total;
    }
}
```

```java
// ব্যবহার:
MathToolbox tool = new MathToolbox();
tool.sum(10, 20, 30);
```

---

## ✅ উপসংহার

- যদি অবজেক্ট-ভিত্তিক ডেটা দরকার না হয় — `static` ব্যবহার করো।
- Utility ফাংশন যেমন `sum`, `average`, `log` এগুলো সবসময়ই `static` হওয়া উচিত।
