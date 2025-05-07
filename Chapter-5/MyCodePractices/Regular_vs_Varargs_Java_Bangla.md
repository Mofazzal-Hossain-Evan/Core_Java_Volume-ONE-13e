
# ☕ Java: Regular Arguments vs Varargs (`...`) Explained in Bangla

## 🔹 Regular Argument (নিয়মিত আর্গুমেন্ট)

```java
public static void greet(String name) {
    System.out.println("Hello, " + name);
}
```

➡️ এখানে তুমি শুধু **একটা মাত্র String** পাঠাতে পারো।

```java
greet("Alice"); // ✅
greet("Alice", "Bob"); // ❌ Error!
```

---

## 🔸 Varargs Argument (`...`) বা Variable-length Argument

```java
public static void greetAll(String... names) {
    for (String name : names) {
        System.out.println("Hello, " + name);
    }
}
```

➡️ এখানে তুমি **একটি না, একাধিক** String পাঠাতে পারো — এমনকি **একটাও না** পাঠালেও সমস্যা নেই।

```java
greetAll(); // ✅
greetAll("Alice"); // ✅
greetAll("Alice", "Bob", "Charlie"); // ✅
```

---

## 🎯 মূল পার্থক্য

| Regular Argument         | Varargs (`...`) Argument              |
|--------------------------|----------------------------------------|
| নির্দিষ্ট সংখ্যা বা টাইপ | যেকোনো সংখ্যা একই টাইপের argument |
| একটার বেশি পাঠানো যায় না | যত খুশি পাঠানো যায় (0 বা তার বেশি)   |
| Fixed                  | Flexible                              |
| Array নয়                | Compiler এটাকে **array-তে** রূপান্তর করে |

---

## 🧠 Behind the scenes

```java
public static void greetAll(String... names)
```

এটা **কম্পাইল** হওয়ার সময় হয়:

```java
public static void greetAll(String[] names)
```

তুমি চাইলেই সরাসরি array-ও পাঠাতে পারো:

```java
greetAll(new String[] { "Alice", "Bob" });
```

---

## ✅ কবে Varargs ব্যবহার করব?

🔹 যখন তুমি চাও method যেন **যেকোনো সংখ্যক input** নিতে পারে।

👉 উদাহরণ:  
- `System.out.printf()`  
- `Math.max()`  
- তোমার নিজের লেখা `log(String... messages)`

---

✍️ লিখেছেন: ChatGPT | ভাষা: বাংলা
