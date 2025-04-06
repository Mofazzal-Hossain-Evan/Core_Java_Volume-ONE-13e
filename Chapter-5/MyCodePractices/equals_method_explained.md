
# Understanding `equals()` Method in Java

---

## 🔹 1. Object ক্লাসের equals() Method এর Default Behavior

### 🔸 কি করে?
```java
public boolean equals(Object obj)
```
- `Object` ক্লাসের ডিফল্ট `equals()` শুধুমাত্র **reference equality** (i.e., `==`) চেক করে।
- অর্থাৎ, দুইটা reference একই object কে পয়েন্ট করলে, তবেই true রিটার্ন করবে।

#### 🔍 উদাহরণ:
```java
String a = new String("Hello");
String b = new String("Hello");

System.out.println(a == b);       // false (different objects)
System.out.println(a.equals(b));  // true (content same)
```

### 🔸 কখন এই default যথেষ্ট?
- যখন **object-এর state** না দেখে, **identity** দিয়েই কাজ চলে যায়।
- যেমনঃ `PrintStream`, `Thread`, `Scanner`—এগুলোর content-based comparison প্রয়োজন হয় না।

---

## 🔹 2. State-based Equality

### 🔸 কখন দরকার?
- যখন দুইটা object **"সমান"** বলার মানে হয় তাদের **ফিল্ডের মান (state)** এক হলে।
- যেমনঃ `Employee` ক্লাসে যদি name, salary, hireDate এক হয়, তাহলে তারা logically সমান।

### 🔸 Custom equals() লিখতে যা করো:
```java
public boolean equals(Object otherObject)
```

#### Step-by-step:

1. **Quick check: same reference?**
   ```java
   if (this == otherObject) return true;
   ```

2. **Null check**
   ```java
   if (otherObject == null) return false;
   ```

3. **Class match না হলে false**
   ```java
   if (getClass() != otherObject.getClass()) return false;
   ```

4. **Typecast এবং field compare**
   ```java
   Employee other = (Employee) otherObject;
   return name.equals(other.name)
      && salary == other.salary
      && hireDay.equals(other.hireDay);
   ```

---

## 🔹 3. Null-safe Comparison with Objects.equals()

### 🔸 সমস্যা:
- যদি `name` বা `hireDay` null হয়, `name.equals(other.name)` এ `NullPointerException` আসবে।

### 🔸 সমাধান:
Use `Objects.equals(a, b)`
```java
return Objects.equals(name, other.name)
   && salary == other.salary
   && Objects.equals(hireDay, other.hireDay);
```

✅ এটি null-safe কারণ:
- দুটোই null হলে → `true`
- একটাই null হলে → `false`
- দুটো non-null হলে → `a.equals(b)`

---

## 🔹 4. Subclass-এ equals() Override করা

### 🔸 প্রক্রিয়া:

1. প্রথমে `super.equals(otherObject)` কল করো।
2. যদি সেটা false দেয়, তাহলে সরাসরি false রিটার্ন করো।
3. যদি true হয়, তাহলে subclass-এর ফিল্ড compare করো।

### 🔸 উদাহরণ: `Manager extends Employee`

```java
@Override
public boolean equals(Object otherObject) {
    if (!super.equals(otherObject)) return false;

    Manager other = (Manager) otherObject;
    return bonus == other.bonus;
}
```

### 🔸 কেন দরকার?
- কারণ subclass-এ নতুন fields থাকতে পারে (যেমন bonus), যেগুলোও তুলনা করতে হবে।

---

## 🔹 5. Record Type এবং equals()

### 🔸 Record কী?
- Java 14+ এ আসা immutable class-এর shorthand।
- যেমনঃ

```java
public record EmployeeRecord(String name, double salary, LocalDate hireDay) {}
```

### 🔸 Record-এ equals() অটো জেনারেটেড হয়।
- দুইটি record instance সমান হবে যদি তাদের **সব ফিল্ড** এক হয়।

```java
EmployeeRecord e1 = new EmployeeRecord("Alice", 50000, LocalDate.of(2020, 1, 1));
EmployeeRecord e2 = new EmployeeRecord("Alice", 50000, LocalDate.of(2020, 1, 1));

System.out.println(e1.equals(e2)); // true
```

---

## ✅ সারাংশ (Summary)

| বিষয় | ব্যাখ্যা |
|------|---------|
| **Object.equals()** | ডিফল্টভাবে reference equality চেক করে |
| **Custom equals()** | state (field values) চেক করতে override করতে হয় |
| **Objects.equals(a, b)** | null-safe equality check |
| **Subclass-এ equals()** | প্রথমে superclass check → তারপর subclass field compare |
| **Record** | automatic equals() based on all fields |

---

🔧 চাইলে এই টপিকের উপর ভিত্তি করে Java কোড সহ একটি পূর্ণ উদাহরণ ফাইলও দেওয়া যাবে!
