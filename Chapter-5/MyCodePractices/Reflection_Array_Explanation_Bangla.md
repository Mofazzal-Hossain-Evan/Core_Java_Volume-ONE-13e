
# 🧠 Java Reflect API দিয়ে Array তৈরির ব্যাখ্যা (Bangla)

## ✅ কোড:
```java
Object intArray = Array.newInstance(int.class, 4);
```

---

## 📌 ধাপে ধাপে ব্যাখ্যা:

### ১. `Array.newInstance()` কী?
Java এর `java.lang.reflect.Array` ক্লাসের static মেথড:
```java
Array.newInstance(Class<?> componentType, int length)
```
এটা runtime-এ নির্দিষ্ট টাইপের array তৈরি করে।

**উদাহরণ:**
```java
Array.newInstance(int.class, 4)
```
➡️ ৪ ঘরের `int[]` array তৈরি করে।

---

### ২. `int.class` মানে কী?
```java
int.class
```
➡️ এটি primitive `int` টাইপের `Class` অবজেক্ট বোঝায়।  
Primitive টাইপগুলো object না হলেও তাদেরও `Class` অবজেক্ট থাকে।

---

### ৩. ফলাফল কী?
```java
Object intArray = Array.newInstance(int.class, 4);
```
➡️ এটি একটি `int[]` array তৈরি করে, তবে রেফারেন্স `Object` টাইপে রাখা হয়।  
তুমি চাইলে এটিকে cast করে ব্যবহার করতে পারো:

```java
int[] myArray = (int[]) intArray;
myArray[0] = 42;
System.out.println(myArray[0]); // ➡️ 42
```

---

### ৪. কেন এমনভাবে তৈরি করতে হয়?
Reflection ব্যবহার করে যখন runtime-এ array তৈরি করতে হয়, তখন compile-time এ type জানা না থাকায় এই পদ্ধতি ব্যবহার করতে হয়।

---

### ৫. Extra: Array Inspection

```java
Class<?> arrayClass = intArray.getClass();
System.out.println(arrayClass.isArray()); // true
System.out.println(arrayClass.getComponentType()); // int
```

---

## 🔚 সংক্ষেপে:

| অংশ | ব্যাখ্যা |
|------|----------|
| `int.class` | primitive `int` টাইপের `Class` object |
| `Array.newInstance(...)` | runtime-এ array তৈরি করে |
| `Object intArray` | তৈরি হওয়া array রেফারেন্স, যেটা cast করে ব্যবহার করা যায় |
