
# 🔍 Java: `Integer.parseInt(arg.toString())` ব্যাখ্যা (বাংলায়)

## 🧩 লাইনটি:

```java
Integer.parseInt(arg.toString())
```

এই একটি লাইনে দুইটি ধাপে কাজ হচ্ছে —

---

## 🔸 1. `arg.toString()`

- এখানে `arg` একটি **Object**
- `.toString()` method object কে **String** এ রূপান্তর করে

### ✅ উদাহরণ:
```java
Object arg = 42;
System.out.println(arg.toString()); // 👉 "42"
```

---

## 🔸 2. `Integer.parseInt(...)`

- এটি একটি **static method** যা String থেকে **int (primitive)** বানায়
- কেবল তখনই কাজ করে, যদি String-এ পুরোপুরি সংখ্যা থাকে

### ✅ উদাহরণ:
```java
String s = "123";
int x = Integer.parseInt(s); // 👉 x = 123
```

---

## 🎯 পুরো লাইন কী করছে?

```java
int value = Integer.parseInt(arg.toString());
```

➡️ `arg` → object  
➡️ `.toString()` → object-কে string বানায়  
➡️ `Integer.parseInt(...)` → string কে int-এ রূপান্তর করে

**👉 সব মিলিয়ে: `Object → String → int`**

---

## ✅ কখন ব্যবহার করবো?

যখন তোমার কাছে এমন একটি object আছে যা আসলে একটি **সংখ্যা (number)** হিসেবে লেখা স্ট্রিং, তখন এই কৌশলটা কাজে লাগে।

```java
Object arg = "56";
int num = Integer.parseInt(arg.toString()); // 👉 num = 56
```

---

## ⚠️ সতর্কতা:

যদি `arg.toString()` এর মান সংখ্যা না হয়, তাহলে **NumberFormatException** হতে পারে।

```java
Object arg = "hello";
int x = Integer.parseInt(arg.toString()); // ❌ Error!
```

---

## 🧠 সংক্ষেপে:

| অংশ | কাজ |
|------|-----|
| `arg.toString()` | Object → String |
| `Integer.parseInt(...)` | String → int |
| পুরো মিলিয়ে | Object → int (যদি উপযুক্ত হয়) |

---

✍️ **উপসংহার:** এই কৌশলটি ব্যবহার করো যখন তুমি জানো যে তোমার object এর ভিতরে একটি সংখ্যামূলক string আছে এবং তুমি সেটা `int` এ রূপান্তর করতে চাও।
