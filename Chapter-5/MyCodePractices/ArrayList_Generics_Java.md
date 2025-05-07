
# ✅ 5.3.2 Accessing ArrayList Elements - মূল পয়েন্টসমূহ

---

## 📌 ArrayList ≠ Array: অ্যাক্সেস পদ্ধতির পার্থক্য
- `ArrayList` ব্যবহার করতে হয় `get()` ও `set()` মেথড দিয়ে।
- সরাসরি `a[i] = harry;` নয় → লিখতে হয়: `staff.set(i, harry);`
- `Employee e = staff.get(i);` ≡ `Employee e = a[i];`

---

## ⚠️ `set()` ব্যবহারের সতর্কতা
- `list.set(i, x);` ব্যবহার করার আগে নিশ্চিত হও যে `i` ইনডেক্সে আগে থেকেই কোনো এলিমেন্ট আছে।
- ❌ ভুল:
  ```java
  var list = new ArrayList<Employee>(100); // capacity 100, size 0
  list.set(0, x); // ভুল, কারণ এখনো কোন এলিমেন্ট নেই
  ```
- ✅ ঠিক:
  ```java
  list.add(x); // add ব্যবহার করে এলিমেন্ট ঢোকাও
  list.set(i, x); // আগে থেকেই এলিমেন্ট থাকলে replace করো
  ```

---

## 🧠 Generics না থাকলে কী সমস্যা হয়?
- Raw `ArrayList` এ `get()` মেথড `Object` রিটার্ন করে।
- তখন করতে হয় ক্যাস্ট:
  ```java
  Employee e = (Employee) staff.get(i);
  ```
- Raw `ArrayList` বিপজ্জনক:
  ```java
  staff.set(i, "Harry Hacker"); // কোনো কম্পাইল টাইম এরর দেয় না!
  ```

- ✅ সঠিক পন্থা: `ArrayList<Employee>` ব্যবহার করা → টাইপ সেফটি নিশ্চিত করে।

---

## 🧪 ArrayList → Array রূপান্তর (Best of both worlds)
- প্রথমে সব `add()` করে `ArrayList`-এ যোগ করো:
  ```java
  var list = new ArrayList<X>();
  while (...) {
    list.add(x);
  }
  ```
- তারপর `toArray()` দিয়ে array বানাও:
  ```java
  var a = new X[list.size()];
  list.toArray(a);
  ```

---

## ➕ মাঝখানে এলিমেন্ট ঢোকানো
- `add(int index, E element)` ব্যবহার করো:
  ```java
  int n = staff.size() / 2;
  staff.add(n, e);
  ```
- `n` ও তার পরের এলিমেন্টগুলো শিফট হয়ে যাবে।

---

## ➖ মাঝখান থেকে এলিমেন্ট মুছে ফেলা
- `remove(int index)` ব্যবহার করো:
  ```java
  Employee e = staff.remove(n);
  ```
- `n`-এর উপরের এলিমেন্টগুলো নিচে শিফট হয়, সাইজ ১ কমে যায়।

---

## 🐢 পারফরমেন্স নোটস
- মাঝখানে বারবার `insert` বা `remove` করলে পারফরমেন্স খারাপ হতে পারে।
- অনেক ডেটার ক্ষেত্রে → `LinkedList` বিবেচনা করা উচিত।

---

## 🔁 Traversal: for-each vs traditional loop
- ✅ for-each:
  ```java
  for (Employee e : staff)
      doSomething(e);
  ```
- ✅ traditional:
  ```java
  for (int i = 0; i < staff.size(); i++) {
      Employee e = staff.get(i);
      doSomething(e);
  }
  ```

---

## 🧪 Listing 5.7 – ArrayListTest.java হাইলাইটস
- `Employee[]` এর বদলে `ArrayList<Employee>` ব্যবহার।
- সুবিধাগুলো:
  - ❌ Array size আগেই declare করতে হয় না।
  - ✅ `add()` দিয়ে যত খুশি এলিমেন্ট যোগ করা যায়।
  - ✅ `.size()` ব্যবহার → `.length` নয়।
  - ✅ `get(i)` → সরাসরি `a[i]` নয়।

---

## 📚 ArrayList Class API (জেনে রাখা দরকার):
```java
E set(int index, E obj);     // নির্দিষ্ট ইনডেক্সে মান বসায়, পুরোনো মান রিটার্ন করে
E get(int index);            // ইনডেক্স থেকে মান রিটার্ন করে
void add(int index, E obj);  // নির্দিষ্ট ইনডেক্সে ইনসার্ট করে
E remove(int index);         // ইনডেক্স থেকে মুছে ফেলে ও মান রিটার্ন করে
```

---

# 🧠 Java Generics Explained (সহজ ভাষায়)

## ✅ Generics কী?
Generics হলো Java-তে টাইপ সেফ (type-safe) কোড লেখার উপায়। এতে করে তুমি একটা ডেটা টাইপ আগে থেকেই বলে দিতে পারো, যাতে রানটাইম-এ টাইপ সংক্রান্ত ঝামেলা না হয়।

**উদাহরণ**:
```java
ArrayList<Employee> staff = new ArrayList<>();
```

এখানে `<Employee>` বলে দিচ্ছে: এই `ArrayList` শুধুমাত্র `Employee` অবজেক্ট রাখবে।

---

## 🧨 Generics না থাকলে কী হতো? (Raw Type)
```java
ArrayList staff = new ArrayList(); // ❌ কোনো টাইপ নির্ধারণ নেই
staff.add("Hello");                // চলে যাবে!
Employee e = (Employee) staff.get(0); // ❗️Runtime error!
```

## 🛡️ Generics এর সুবিধা
1. **Type Safety** – ভুল টাইপ ইনপুট দিলে কম্পাইল টাইমেই ধরা পড়ে।
2. **No Need for Casting** – `get()` করলে আর কাস্ট করতে হয় না।
3. **Code Reusability** – একবার generic ক্লাস লিখে যেকোনো টাইপে ব্যবহার করা যায়।

---

## 📘 Generic Class Example:
```java
public class Box<T> {
    private T item;

    public void set(T item) { this.item = item; }
    public T get() { return item; }
}
```

**ব্যবহার:**
```java
Box<String> stringBox = new Box<>();
stringBox.set("Dino Egg");
String value = stringBox.get(); // No casting!
```

---

## ➕ অতিরিক্ত পয়েন্ট: ArrayList Capacity vs Size

- **Capacity**: অভ্যন্তরীণ অ্যারে কতগুলো এলিমেন্ট রাখার মতো জায়গা রিজার্ভ করে রেখেছে।
- **Size**: বাস্তবিকভাবে কতগুলো এলিমেন্ট বর্তমানে রাখা আছে।

**উদাহরণ**:
```java
ArrayList<Employee> list = new ArrayList<>(100); // capacity 100
System.out.println(list.size()); // output: 0
```

➡️ তুমি `set(0, x)` করতে পারবে না, কারণ size এখনো 0—even though capacity 100!

**সঠিক পন্থা**:
```java
list.add(x); // সাইজ বাড়ে
list.set(0, x); // এখন replace করা যাবে
```
