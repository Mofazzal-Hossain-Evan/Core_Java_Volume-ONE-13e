
# 💡 Java: `append()` এবং `getMessage()` ব্যাখ্যা (বাংলায়)

---

## 🔹 কোড উদাহরণ:

```java
result.append("[FormatError: ").append(e.getMessage()).append("]");
```

এই লাইনটি Exception handle করার সময় format করা একটি error message তৈরি করে। চল একে একে দেখি প্রতিটি অংশ কী করছে।

---

## 🧩 1. `result.append("[FormatError: ")`

- `result` হচ্ছে একটি `StringBuilder` অবজেক্ট
- `.append()` method নতুন স্ট্রিং যোগ করে (concatenate)
- এখানে শুরুতে যুক্ত করছে 👉 `[FormatError: `

---

## 🧩 2. `.append(e.getMessage())`

- `e` হচ্ছে Exception অবজেক্ট
- `getMessage()` একটি method, যা সেই exception-এর **message** রিটার্ন করে
- উদাহরণস্বরূপ, যদি `e.getMessage()` হয় `"Missing %s"`, তাহলে:

```java
result.append("[FormatError: ").append("Missing %s").append("]");
```

➡️ ফলাফল হবে: `[FormatError: Missing %s]`

---

## 🧩 3. `.append("]")`

- শেষ অংশে বন্ধনী `"]"` যোগ করা হয়

---

## 🧠 কেন `append()` ব্যবহার করা হয়?

- `StringBuilder.append()` অনেক efficient — এটি প্রতিবার নতুন String তৈরি না করে একই object-এ যোগ করে

---

## 📌 `getMessage()` সম্পর্কে বিস্তারিত

### 🔹 এটি কী?

- `getMessage()` হলো `Throwable` class-এর একটি method
- এটি exception-এর ভিতরের message (String) return করে

### ✅ উদাহরণ:

```java
try {
    int num = Integer.parseInt("abc");
} catch (NumberFormatException e) {
    System.out.println(e.getMessage()); // 👉 "For input string: "abc""
}
```

### 🔹 কাজ:

- মূলত error message বের করার জন্য
- log লেখার সময়, debugging, বা user-friendly error দেখানোর জন্য ব্যবহৃত হয়

---

## ⚠️ সতর্কতা:

সব Exception-এ `getMessage()` থাকবেই এমন নয় — কিছু ক্ষেত্রে message `null` হতে পারে।

```java
NullPointerException e = new NullPointerException();
System.out.println(e.getMessage()); // 👉 null
```

তাই `.getMessage()` ব্যবহারের আগে null check করা ভালো অভ্যাস।

---

## 🧠 সংক্ষেপে:

| বিষয় | ব্যাখ্যা |
|------|---------|
| `append()` | `StringBuilder`-এ নতুন স্ট্রিং যোগ করে |
| `getMessage()` | Exception-এর message রিটার্ন করে |
| পুরো লাইন | একটি সুন্দর error format তৈরি করে: `[FormatError: <message>]` |

---

✍️ **উপসংহার:** `append()` এবং `getMessage()` মিলে একটি readable এবং informative error message তৈরি করতে সাহায্য করে — যা ব্যবহারকারী বা developer দুজনের জন্যই সহায়ক।
