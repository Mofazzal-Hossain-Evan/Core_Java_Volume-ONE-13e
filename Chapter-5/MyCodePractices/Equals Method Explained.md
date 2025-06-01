# Java-র `equals()` মেথড নিয়ে বিস্তারিত আলোচনা (বাংলায়)

## 🔹 ১. `equals()` মেথডের মূল ধারণা

Java-তে `equals()` মেথড `Object` ক্লাস থেকে উত্তরাধিকারসূত্রে পাওয়া যায় এবং এটি ব্যবহার হয় দুটি অবজেক্ট সমান কিনা তা নির্ধারণ করার জন্য।

```java
public boolean equals(Object obj) {
    return (this == obj);
}
```

এটি ডিফল্টভাবে **reference equality** চেক করে, অর্থাৎ দুইটি অবজেক্ট একই মেমোরি লোকেশনে আছে কিনা তা দেখে।

---

## 🔹 ২. Reference Equality বনাম Logical Equality

প্রায়শই আমরা চাই **logical equality**, অর্থাৎ দুইটি অবজেক্ট যদি একই data বা state ধারণ করে, তবে তারা সমান হিসেবে বিবেচিত হবে।

উদাহরণ: দুইজন `Employee`-এর নাম, বেতন এবং যোগদানের তারিখ যদি এক হয়, তাহলে তারা logically equal ধরা যায়।

---

## 🔹 ৩. `Employee` ক্লাসে `equals()` Override করা

```java
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;
        return Objects.equals(name, other.name)
            && salary == other.salary
            && Objects.equals(hireDay, other.hireDay);
    }
}
```

### ✅ গুরুত্বপূর্ণ বিষয়:

- `this == otherObject`: একি রেফারেন্স হলে true রিটার্ন করে।
- `otherObject == null`: null অবজেক্ট হ্যান্ডল করা হয়।
- `getClass() != otherObject.getClass()`: অন্য ক্লাস হলে false।
- `Objects.equals()`: null-safe তুলনার জন্য ব্যবহৃত হয়।

---

## 🔹 ৪. Subclass (`Manager`) এ `equals()` মেথড

```java
public class Manager extends Employee {
    private double bonus;

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }
}
```

🔸 প্রথমে `super.equals()` দিয়ে `Employee` ক্লাসের ফিল্ডগুলো চেক করা হয়। তারপর subclass (`Manager`) এর `bonus` ফিল্ড চেক করা হয়।

---

## 🔹 ৫. Record ক্লাসে `equals()` মেথড

Java-এর record ক্লাসগুলো immutable এবং তাদের state `constructor`-এর মাধ্যমে সেট হয়। Record ক্লাসগুলো স্বয়ংক্রিয়ভাবে `equals()`, `hashCode()`, ও `toString()` মেথড দিয়ে দেয়।

```java
public record Employee(String name, double salary, LocalDate hireDay) {}
```

👉 দুইটি record object সমান হবে যদি তাদের প্রত্যেকটি ফিল্ডের মান সমান হয়।

---

## 🔹 ৬. সারসংক্ষেপ টেবিল

| বিষয়                    | ব্যাখ্যা                              |
| ----------------------- | ------------------------------------- |
| ডিফল্ট `equals()`       | reference equality চেক করে            |
| Logical equality দরকার? | হ্যাঁ, অনেক ক্ষেত্রে override প্রয়োজন |
| `getClass()`            | ক্লাস সঠিক কিনা যাচাই করে             |
| `Objects.equals()`      | null-safe তুলনা করে                   |
| Subclass-এ `equals()`   | `super.equals()` দিয়ে শুরু করা উচিত   |
| Record ক্লাস            | অটো জেনারেটেড `equals()` দিয়ে দেয়     |

---

## ✅ Best Practices

- `equals()` override করলে অবশ্যই `hashCode()` ও override করা উচিত।
- `Objects.equals()` ব্যবহার করলে null সংক্রান্ত error কমে যায়।
- `equals()` method-এ symmetry, transitivity, এবং consistency বজায় রাখা জরুরি।

