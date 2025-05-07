# Java Switch Pattern Matching: Variable Scope and Fallthrough (বাংলা ব্যাখ্যা)

এই অংশটি Java switch pattern matching-এর কিছু সূক্ষ্ম ও গুরুত্বপূর্ণ দিক নিয়ে আলোচনা করে, বিশেষ করে **variable scope** এবং **fallthrough** বিষয়গুলোর উপর।

---

## 🔹 ১. Variable Scope (ভ্যারিয়েবল কোথায় পর্যন্ত ব্যবহার করা যাবে)

```java
switch (obj) {
   case String s when s.length() == 0:
      System.out.println("empty string");
   default:
      System.out.println(obj.toString());
}
```

🔸 এখানে `s` নামের ভ্যারিয়েবলটি শুধু **নিজের case block**-এর ভিতরে ব্যবহার করা যাবে (অর্থাৎ `when` guard-এ ও body-তে)। `default` case বা অন্য কোনো case-এ এটা ব্যবহার করা যাবে না।

---

## 🔹 ২. Fallthrough-এ Variable Binding নিয়ে সতর্কতা

```java
switch (obj) {
   case String s when s.length() > 0:
      System.out.println(s.codePointAt(0)); // Fallthrough
   case Integer n:
      System.out.println(n); // ❌ ERROR
}
```

🔸 এখানে `n` bind হবে না, কারণ প্রথম case থেকে দ্বিতীয়টিতে যদি fallthrough হয়, তাহলে `obj` Integer না-ও হতে পারে।

---

## 🔹 ৩. Unnamed variable দিয়ে Fallthrough (Java 21 Preview Feature)

```java
switch (obj) {
   case String s when s.length() == 0:
      System.out.print("empty "); // Fallthrough
   case String _:
      System.out.println("string"); // ✅ OK
}
```

🔸 `_` হল unnamed variable, যার মাধ্যমে fallthrough সম্ভব।

---

## 🔹 ৪. পুরানো স্টাইলের Variable Declaration

```java
switch (obj) {
   case String s:
      String t = s;
   default:
      System.out.println(t); // ❌ ERROR: t may not have been initialized
}
```

🔸 যদিও `t` পুরো switch-এর জন্য visible, কিন্তু অন্য case-এ initialize না হলে **compiler error** হয়।

---

## 🔸 Example ১: Type Pattern Matching

```java
String description = switch (e) {
   case Executive exec when exec.getTitle().length() >= 20 -> 
       "An executive with an impressive title";
   case Executive exec -> 
       "An executive with a title of " + exec.getTitle();
   case Manager m -> {
       m.setBonus(10000);
       yield "A manager who just got a bonus";
   }
   case null -> "No employee";
   default -> "A lowly employee with a salary of " + e.getSalary();
};
```

---

## 🔸 Example ২: Record Pattern Matching

```java
String description = switch (p) {
   case Point(var x, var y) when x == 0 && y == 0 -> "origin";
   case Point(var x, var __) when x == 0 -> "on x-axis";
   case Point(var __, var y) when y == 0 -> "on y-axis";
   default -> "not on either axis";
};
```

---

## ✅ সারাংশ (মনে রাখার মতো পয়েন্ট)

| বিষয় | ব্যাখ্যা |
|------|---------|
| Variable Scope | Type pattern ভ্যারিয়েবল তার case block পর্যন্ত valid |
| Fallthrough Restriction | Fallthrough করে type pattern-এ যাওয়া যায় না (binding সমস্যার জন্য) |
| Unnamed variable | `_` ব্যবহার করলে fallthrough করা যায় (Java 21 feature) |
| Variable declaration | case block-এ ডিক্লেয়ার করা variable পুরো switch-এ valid, কিন্তু initialize না থাকলে সমস্যা হয় |