
# ৫.৩.২: ArrayList এর এলিমেন্ট এক্সেস করা (Java Bangla Explanation)

## 🔸 ১. Array vs ArrayList
- **Array** → `[]` দিয়ে এলিমেন্ট এক্সেস করা যায় → `a[i] = harry`
- **ArrayList** → `get(i)` ও `set(i, object)` ব্যবহার করতে হয় → `staff.set(i, harry)`

**কারণ:** ArrayList হলো Java এর utility class, built-in syntax না।

---

## 🔸 ২. set() ব্যবহারে সাবধানতা

```java
var list = new ArrayList<Employee>(100); // capacity 100, size 0
list.set(0, x); // ❌ ভুল!
```

- শুধুমাত্র `add()` দিয়ে element ঢোকানোর পরই `set()` ব্যবহার করা যায়।

---

## 🔸 ৩. get() দিয়ে এলিমেন্ট আনা

```java
Employee e = staff.get(i);
```

- সমান `Employee e = a[i];` যদি `a` array হত।

---

## 🔸 ৪. Generic না থাকলে get() থেকে Object ফেরত আসতো

```java
Employee e = (Employee) staff.get(i); // পুরানো পদ্ধতি
staff.set(i, "Harry Hacker"); // ❌ কম্পাইল হবে, কিন্তু runtime error
```

✅ Generic (`ArrayList<Employee>`) ব্যবহার করলে compile time-এ ভুল ধরা পড়ে।

---

## 🔸 ৫. toArray() দিয়ে ArrayList → Array

```java
var list = new ArrayList<X>();
while (...) {
   list.add(x);
}
X[] a = new X[list.size()];
list.toArray(a);
```

---

## 🔸 ৬. মাঝখানে insert করা

```java
int n = staff.size() / 2;
staff.add(n, e);
```

- Index `n` থেকে সব element একধাপ পিছিয়ে যায়।

---

## 🔸 ৭. মাঝখান থেকে remove করা

```java
Employee e = staff.remove(n);
```

- উপরের element গুলো নিচে নেমে আসে।

📌 অনেকবার insert/remove হলে `LinkedList` ভালো।

---

## 🔸 ৮. for-each loop দিয়ে traversal

```java
for (Employee e : staff) {
   doSomethingWith(e);
}
```

- সমান:
```java
for (int i = 0; i < staff.size(); i++) {
   Employee e = staff.get(i);
   ...
}
```

---

## 🔸 ৯. Array vs ArrayList পার্থক্য

| কাজ           | Array     | ArrayList   |
|----------------|-----------|-------------|
| সাইজ নির্ধারণ     | আগেই দিতে হয় | runtime এ বাড়ানো যায় |
| যোগ করা         | `a[i] = ...` | `add()`       |
| সংখ্যা গণনা       | `length`     | `size()`       |
| এক্সেস          | `a[i]`       | `get(i)`       |
