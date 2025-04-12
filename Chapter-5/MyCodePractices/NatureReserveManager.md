
# 🌿 NatureReserveManager প্রকল্প ব্যাখ্যা (Bangla)

এই প্রকল্পটি একটি ইকো-রিজার্ভ ব্যবস্থাপনা সিমুলেশন তৈরি করে যেখানে আমরা `ArrayList`, generic type, raw type, capacity, এবং utility method গুলোর ব্যবহার শিখি ও প্রয়োগ করি।

---

## 📁 প্যাকেজ: `ecoreservemanager`

এই প্যাকেজের মধ্যে নিচের Java ফাইলগুলো আছে:

- `EcoReserveEmployeeManager.java`
- `Employee.java`
- `LegacyDataLoader.java`

---

## 🔹 1. `Employee.java`

```java
public class Employee {
    private String name;
    private int id;
    private String department;
    private String location;
    private double salary;

    public Employee(String name, int id, String department, String location, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.location = location;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + id + ") - " + department + " @ " + location + " $" + salary;
    }
}
```

🧠 এটি একটি মডেল ক্লাস যা রিজার্ভের এমপ্লয়িদের প্রতিনিধিত্ব করে।

---

## 🔹 2. `LegacyDataLoader.java`

```java
public class LegacyDataLoader {
    public static ArrayList load() {
        ArrayList legacy = new ArrayList();
        legacy.add("Old record: Wild Bison relocation");
        legacy.add(1984);
        legacy.add(new Employee("Legacy Ranger", 999, "Unknown", "Old Forest", 0));

        System.out.println("\n📜 Legacy Data (Raw Type):");
        for (Object obj : legacy) {
            System.out.println(" - " + obj);
        }

        return legacy;
    }
}
```

📌 এই ক্লাসটি legacy (পুরনো) টাইপের ডেটা ধারণ করে, যেখানে generic ব্যবহার করা হয়নি।

- `load()` মেথড একটি raw `ArrayList` তৈরি করে
- কিছু `String`, `int`, এবং `Employee` অবজেক্ট যোগ করে
- প্রিন্ট করে এবং সেই লিস্ট রিটার্ন করে

➡️ এই মেথড ব্যবহার করা হয় মেইন ক্লাস থেকে পুরোনো ডেটা লোড করতে।

---

## 🔹 3. `EcoReserveEmployeeManager.java`

```java
public class EcoReserveEmployeeManager {
    public static void main(String[] args) {
        var staff = new ArrayList<Employee>();
        staff.ensureCapacity(5); // preallocate

        staff.add(new Employee("Luna Treewatcher", 101, "Forest", "North Grove", 55000));
        staff.add(new Employee("Kai Riverkeeper", 102, "River", "East Stream", 52000));
        staff.add(new Employee("Aria Windchaser", 103, "Sky", "High Ridge", 57000));

        System.out.println("🌿 Nature Reserve Staff:");
        for (Employee e : staff) {
            System.out.println(" - " + e);
        }

        System.out.println("\n🔍 Total current staff: " + staff.size());

        ArrayList legacyData = LegacyDataLoader.load();

        staff.trimToSize();
    }
}
```

📌 এই ক্লাসে মূল কাজগুলো হয়:

- `ArrayList<Employee>` তৈরি করা হয় `var` ব্যবহার করে
- কিছু এমপ্লয়ি যোগ করা হয় `add()` দিয়ে
- `ensureCapacity()` দিয়ে শুরুতেই স্পেস রাখা হয়
- শেষে `trimToSize()` দিয়ে অতিরিক্ত মেমোরি বাদ দেওয়া হয়
- `LegacyDataLoader.load()` ডাকা হয় পুরোনো ডেটা ম্যানেজ করার জন্য

---

## 📤 `load()` কেন `return` করে?

```java
return legacy;
```

➡️ `load()` মেথড একটি `ArrayList` তৈরি করে এবং সেটা ফেরত পাঠায় (return করে), যাতে caller (main method) সেই ডেটা ব্যবহার করতে পারে।

✅ না করলে future এ লিস্টটা আর ব্যবহার করা যেত না।

---

## ✅ শেখার বিষয়সমূহ:

- Generics: `ArrayList<Employee>` vs `ArrayList`
- Diamond syntax
- `var` এর ব্যবহার ও সম্ভাব্য ভুল
- Legacy/raw types এর ঝুঁকি
- Performance tuning: `ensureCapacity()` ও `trimToSize()`
- Data separation through helper class (`LegacyDataLoader`)
- Object printing with `toString()` override

---

## 📦 উপসংহার

এই প্রজেক্টের মাধ্যমে তোমার শেখা হয়েছে কীভাবে:

- আধুনিক ও পুরোনো ডেটা হ্যান্ডেল করতে হয়
- ArrayList-এর capacity, grow, trim ব্যবস্থাপনা করতে হয়
- Raw vs Generic টাইপ ব্যবহার ও ঝুঁকি বুঝতে হয়

এটি একটি ছোট কিন্তু শক্তিশালী Java প্রজেক্ট যাতে core collection ধারণাগুলোর চমৎকার ব্যাখ্যা আছে। 🌱
