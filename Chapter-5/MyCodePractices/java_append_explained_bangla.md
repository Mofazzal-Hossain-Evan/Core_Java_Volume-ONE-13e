
# 🔤 Java `append()` মেথড ব্যাখ্যা (বাংলায়)

## 🔍 `append()` কী?

`append()` হলো Java-র `StringBuilder` ক্লাসের একটি মেথড, যেটা স্ট্রিংয়ের শেষে নতুন কিছু **যোগ (add)** করে।

> এটা ঠিক যেন একটি স্ট্রিংয়ের পাশে আরেকটা স্ট্রিং বা ক্যারেক্টার বসিয়ে দেওয়া।

---

## 📘 মেথডের গঠন:

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" World");
```

🔁 আউটপুট:

```
Hello World
```

---

## 🔧 কোড উদাহরণ:

```java
StringBuilder message = new StringBuilder();

message.append("Name: ");
message.append("Rafi");
message.append(", Age: ");
message.append(22);

System.out.println(message.toString());
```

🖨️ আউটপুট:

```
Name: Rafi, Age: 22
```

---

## 📌 কোথায় ব্যবহার করো?

- যখন তুমি বারবার স্ট্রিংয়ের মধ্যে কিছু **জোড়া লাগাতে** চাও  
- বিশেষ করে লুপের মধ্যে  
- `+` অপারেটরের থেকে অনেক ফাস্ট

---

## ✅ আমাদের `MyFormatter`-এ ব্যবহার:

```java
result.append('%');
```

মানে 👉 `result` নামের `StringBuilder`-এর শেষে একটা `%` অক্ষর **যোগ করো**।

---

## 🔁 সংক্ষেপে:

| বিষয়              | মানে                        |
|-------------------|-----------------------------|
| `append("abc")`   | স্ট্রিংয়ের শেষে `"abc"` বসাও |
| `append('%')`     | `%` অক্ষর বসাও              |
| `append(123)`     | 123 নাম্বারটা যোগ করো       |
