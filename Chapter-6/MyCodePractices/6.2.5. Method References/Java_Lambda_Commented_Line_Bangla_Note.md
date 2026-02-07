নিচে পুরো ব্যাখ্যাটি **পরিপাটি, পরিষ্কার এবং নোট আকারে** সাজিয়ে দেওয়া হলো—এটা সরাসরি তুমি **save / revise** করতে পারবে ✅

---

# 📘 Java Lambda Expression – Commented Line Explanation (Bangla Note)

## 🔹 Comment করা লাইনের কোড

```java
// u.lastLogin = LocalDate.now(); 
// (cannot modify final field in lambda)
```

---

## 🔹 কেন এই লাইনটি Comment করা হয়েছে?

Java-এর **Lambda expression**–এর ভিতর থেকে বাইরের কোনো variable বা object-এর state **modify (পরিবর্তন)** করা যায় না।

Lambda ব্যবহার করার সময়, বাইরের যেসব variable lambda-র ভিতরে ব্যবহার করা হয়, সেগুলো অবশ্যই হতে হবে:

✅ **final**
অথবা
✅ **effectively final**

---

## 🔹 Effectively Final বলতে কী বোঝায়?

একটি variable:

* একবার মান পায়
* এরপর আর কখনো পরিবর্তন করা হয় না

এমন variable–কে **effectively final** বলা হয়।

---

## 🔹 এখানে আসল সমস্যা কী?

```java
u.lastLogin = LocalDate.now();
```

এই লাইনে:

* `u` হলো lambda’র বাইরে থেকে আসা একটি object
* তার `lastLogin` field পরিবর্তন করার চেষ্টা করা হচ্ছে
* কিন্তু **lambda-এর ভিতরে বাইরের object modify করা Java allow করে না**

👉 তাই compiler error হয়:

```
cannot modify final field in lambda
```

এই কারণেই লাইনটি **commented out** রাখা হয়েছে।

---

## 🔹 সম্ভাব্য সমাধান (Solution)

একটি workaround হলো **Wrapper Class ব্যবহার করা**।

---

## 🔹 Wrapper Class কী?

Wrapper Class একটি mutable container হিসেবে কাজ করে, যা মূল object–কে wrap করে রাখে।

---

## 🔹 Wrapper Class Example

```java
class MutableUser {
    User user;

    MutableUser(User u) {
        this.user = u;
    }
}
```

এখানে:

* `MutableUser` এক্ষেত্রে mutable (পরিবর্তনযোগ্য)
* `User` object–কে wrap করে রাখা হয়েছে

---

## 🔹 Stream / Lambda-তে Wrapper ব্যবহার

```java
List<MutableUser> mutableUsers = users.stream()
    .map(MutableUser::new)
    .collect(Collectors.toList());
```

এখানে কী হচ্ছে:

* `users` list-এর প্রতিটি `User`
* `MutableUser` দিয়ে wrap করা হচ্ছে
* একটি নতুন mutable list তৈরি হচ্ছে

এভাবে lambda-এর limitation এড়ানো যায়।

---

## 🔹 গুরুত্বপূর্ণ পয়েন্ট (Exam / Interview Ready)

✅ Lambda-এর ভিতরে বাইরের variable modify করা যায় না
✅ বাইরের variable অবশ্যই final বা effectively final হতে হবে
✅ Object modify করতে হলে wrapper class ব্যবহার করা যেতে পারে
✅ Lambda মূলত **side-effect free** রাখার জন্য এই restriction দেয়

---

📌 **Short Note:**

> *Lambda expressions in Java do not allow modification of enclosing variables. Wrapper classes can be used when mutation is required.*

---

চাও তো আমি এটাকে **PDF-style note**, **cheat sheet**, বা **interview Q&A ফরম্যাটে**ও বানিয়ে দিতে পারি 👍
