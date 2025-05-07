
# ⚠️ Java: `throw new IllegalArgumentException()` ব্যাখ্যা (বাংলায়)

## ❓ এটা কি Object?

✅ **হ্যাঁ**, `new IllegalArgumentException(...)` হলো একটি **Object**।

---

## 🔍 ব্যাখ্যা:

```java
throw new IllegalArgumentException("message");
```

এই লাইনে:

- `new IllegalArgumentException("message")` → এটি একটি **Exception Object** তৈরি করছে।
- `throw` → এই object-টিকে **ছুড়ে ফেলা হচ্ছে (throw)**

> তাই এখানে `IllegalArgumentException` হচ্ছে একটি class, এবং `new` দিয়ে বানানো অংশটি হচ্ছে সেই class-এর একটি instance, অর্থাৎ একটি object।

---

## 🧠 তুলনা:

```java
String name = new String("Hello");
```
এখানে `name` হলো একটি `String` object।

ঠিক তেমনি,

```java
throw new IllegalArgumentException("Invalid input!");
```

এখানে `new IllegalArgumentException(...)` হলো একটি **exception object**।

---

## 📦 `IllegalArgumentException` সম্পর্কে:

- এটি Java-এর **built-in exception class**
- `RuntimeException` থেকে extends করা হয়েছে
- `java.lang` প্যাকেজে থাকে (import করার দরকার নেই)

---

## ✅ ব্যবহার কবে করো?

যখন কোনো মেথডে **অবৈধ (invalid)** বা **অপ্রত্যাশিত ইনপুট** পাঠানো হয় — তখন এই exception ব্যবহার করো।

```java
public void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
    this.age = age;
}
```

---

## 🔁 সংক্ষেপে:

| বিষয় | ব্যাখ্যা |
|------|----------|
| `new IllegalArgumentException(...)` | একটি Exception Object তৈরি করে |
| `throw` | object-টি ছুড়ে দেয় |
| Class | Java built-in class |
| কাজ | ভুল ইনপুট বোঝাতে ব্যবহার হয় |

---

✍️ **Note:** যেকোনো Exception class দিয়ে object বানালে সেটা object-ই হয়, কারণ Java-তে সব class থেকেই object তৈরি হয়।
