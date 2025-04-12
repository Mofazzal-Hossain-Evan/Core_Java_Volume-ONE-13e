
# 🔢 Section: 5.3.1 Declaring Array Lists (বাংলায়)

---

## ✅ 1. Declaration with full type:
```java
ArrayList<Employee> staff = new ArrayList<Employee>();
```
📌 বোঝায়:
- ArrayList হল জেনেরিক ক্লাস, যেখানে `<Employee>` মানে হচ্ছে, এই লিস্ট শুধু Employee অবজেক্টই রাখবে।
- ডান পাশে `<Employee>` আবার লিখতে হচ্ছে কারণ Java 5+ এ জেনেরিক টাইপ এসেছে, যা কম্পাইল টাইমেই টাইপ-চেক নিশ্চিত করে।

---

## ✅ 2. Declaration using var:
```java
var staff = new ArrayList<Employee>();
```
📌 বোঝায়:
- Java 10 থেকে `var` চালু হয়েছে, যা টাইপ inference করে।
- কম্পাইলার বুঝে নেয় `staff` টাইপ হবে `ArrayList<Employee>`, কারণ ডান পাশে `<Employee>` দেওয়া আছে।
- `var` দিয়ে লেখার সুবিধা: কোড ছোট হয়, ক্লিন হয়।

---

## ✅ 3. Diamond Syntax:
```java
ArrayList<Employee> staff = new ArrayList<>();
```
📌 Diamond Syntax কি?
- `<>` দেখতে ডায়মন্ডের মতো, তাই এই নাম।
- কম্পাইলার ডান পাশে `<Employee>` ইনফার করতে পারে কারণ বামপাশে `ArrayList<Employee>` দেওয়া আছে।
- এটা Java 7 থেকে চালু হয়েছে।
🧠 Tip: এটা কোডকে কম ভারি ও কম ডুপ্লিকেট করে।

---

## ⚠️ 4. var + diamond = Problem:
```java
var elements = new ArrayList<>();
```
📌 সমস্যা:
- এখানে টাইপ ইনফারেন্সের জন্য কোনো রেফারেন্স টাইপ দেওয়া নেই।
- তাই Java ধরে নেয় এটা `ArrayList<Object>`।
- ফলে future এ টাইপ mismatch হতে পারে (যেমন cast exception)।

✅ সঠিক উপায়:
```java
var elements = new ArrayList<String>(); // তাহলে elements হবে ArrayList<String>
```

---

## ✅ 5. Raw Type:
```java
ArrayList staff = new ArrayList(); // discouraged
```
📌 Raw Type মানে:
- `<...>` বাদ দিয়ে শুধু `ArrayList` ব্যবহার করা।
- এটি pre-Java 5 এর সময়কার স্টাইল।
- Generic টাইপ ইনফরমেশন নাই, তাই type safety নাই, cast exception হবার সম্ভাবনা বেশি।

---

## ✅ 6. Vector vs ArrayList:
- পুরোনো Java তে `Vector` ব্যবহার হত, কিন্তু এখন `ArrayList` বেশি efficient।
- `Vector` synchronized ছিল, তাই একটু ধীর ছিল।
- Modern Java-তে `Vector` একদম avoid করতে বলা হয়।

---

## 🧑‍💼 ArrayList ব্যবহার:

### ✅ 7. Adding Elements:
```java
staff.add(new Employee("Harry Hacker", ...));
```
📌 add() method:
- ArrayList এর শেষে অবজেক্ট যোগ করে।
- internal array ফুল হলে, Java auto grow করে নতুন বড় array allocate করে এবং পুরোনো ডেটা কপি করে।

---

### ✅ 8. ensureCapacity():
```java
staff.ensureCapacity(100);
```
📌 ব্যবহার কখন করবো?
- যদি আগে থেকেই জানো যে লিস্টে অনেক item যোগ হবে।
- তাহলে `ensureCapacity` দিয়ে স্পেস রিজার্ভ করে নাও, যাতে বারবার রি-অলোকেশন না হয়।
🧠 Performance Booster Tip:
- `ensureCapacity(n)` → initial performance বুস্ট দেয়।

---

### ✅ 9. Constructor with Capacity:
```java
ArrayList<Employee> staff = new ArrayList<>(100);
```
📌 তফাৎ বোঝো:
```java
new ArrayList<>(100); // capacity
new Employee[100];    // size
```
🔍 মূল তফাৎ:
- `ArrayList<>(100)` → ফাঁকা লিস্ট তৈরি হয়, শুধু স্পেস রিজার্ভ করে।
- `new Employee[100]` → ১০০টা null স্লট তৈরি হয়, array এর actual size 100 হয়।

---

### ✅ 10. size() vs length:
```java
staff.size(); // returns number of elements
a.length;     // for array
```
📌 size():
- ArrayList-এ কয়টা element যোগ হয়েছে, সেটাই জানায়।

📌 length:
- array-তে মোট কয়টা স্লট আছে তা বোঝায়, না যে কয়টা ব্যবহার করা হয়েছে।

---

### ✅ 11. trimToSize():
```java
staff.trimToSize();
```
📌 কেন দরকার?
- ধরো লিস্টের capacity 100, কিন্তু 30 টা অবজেক্টই যোগ হয়েছে।
- trim করলে অতিরিক্ত memory রিলিজ পাবে।

⚠️ Warning:
- trim করার পর আবার যদি `add()` করো, তাহলে নতুন করে বড় array তৈরি হবে → costly.

🧠 Best practice:
- যখন নিশ্চিত হবে আর কিছু যোগ হবে না, তখনই `trimToSize()` করো।

---

## ✅ 12. Java vs C++ Comparison:

📌 C++ Vector:
- `[]` operator দিয়ে access করা যায়।
- assignment `a = b` → নতুন copy তৈরি হয়।

📌 Java ArrayList:
- `get(index)`, `set(index, val)` method দিয়ে access করতে হয়।
- assignment `a = b` → reference copy হয়, shallow copy।

✅ Java no operator overloading, তাই `[]` use করতে পারো না।

---

## 📘 Summary Table:

| Concept               | Java Syntax                                    | Notes                            |
|-----------------------|------------------------------------------------|----------------------------------|
| Full Declaration      | `ArrayList<Employee> staff = new ArrayList<Employee>();` | Pre-Java 7                      |
| Diamond Syntax        | `ArrayList<Employee> staff = new ArrayList<>();` | Java 7+                          |
| var usage             | `var staff = new ArrayList<Employee>();`       | Java 10+                         |
| var + diamond issue   | `var x = new ArrayList<>();` → `ArrayList<Object>` | Be careful                      |
| Raw type              | `ArrayList staff = new ArrayList();`           | Avoid                            |
| Add elements          | `staff.add(new Employee(...));`                | Auto grow                        |
| Ensure capacity       | `staff.ensureCapacity(100);`                   | Performance                      |
| Set initial capacity  | `new ArrayList<>(100);`                        | Only capacity, not size          |
| Trim excess memory    | `staff.trimToSize();`                          | Use when final                   |
| Get current size      | `staff.size()`                                 | Number of elements               |
| Arrays vs ArrayList   | `length` vs `size()`                           | Important difference             |
| Java vs C++ Vector    | Reference vs Copy                              | Java doesn’t copy values         |
