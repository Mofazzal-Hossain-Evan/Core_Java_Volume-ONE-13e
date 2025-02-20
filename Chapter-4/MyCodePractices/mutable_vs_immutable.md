# Mutable vs. Immutable in Java

## 1️⃣ What is Mutability?
Mutability refers to whether an object's state (data) can be changed after it is created.

---

## 2️⃣ Immutable Objects (Cannot Change)
An **immutable object** is one whose state **cannot be modified** after creation.

### **Characteristics of Immutable Objects:**
✔ **Final fields**: Data is set once via the constructor and cannot be modified.  
✔ **No setter methods**: No methods exist to modify field values.  
✔ **Defensive copies**: Returns copies of mutable fields instead of direct references.  

### **Examples of Immutable Objects in Java:**
- `String`
- Wrapper classes (`Integer`, `Double`, `Boolean`, etc.)
- Java `Records` (Introduced in Java 14)

### **Example: Immutable `Person` Class**
```java
final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```
Here, `name` and `age` **cannot be changed** after the object is created.

---

## 3️⃣ Mutable Objects (Can Change)
A **mutable object** allows modification of its state after creation.

### **Characteristics of Mutable Objects:**
✔ **Setter methods exist** to modify fields.  
✔ **Data can be changed after initialization.**  
✔ **References to mutable objects allow modifications.**  

### **Examples of Mutable Objects in Java:**
- `ArrayList`
- `HashMap`
- `StringBuilder`

### **Example: Mutable `Car` Class**
```java
class Car {
    private String model;
    
    public Car(String model) {
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
```
Here, `setModel()` **allows modifying** the `model` field after the object is created.

---

## 🔍 Key Difference Between Mutable and Immutable
| Feature  | Mutable Objects | Immutable Objects |
|----------|---------------|----------------|
| **State Change** | Allowed after creation | Not allowed after creation |
| **Setter Methods** | Usually present | Not present |
| **Thread-Safety** | Not inherently thread-safe | Thread-safe by default |
| **Performance** | More efficient for frequent changes | More memory-efficient for reuse |

---

## 🔥 Example: `String` (Immutable) vs. `StringBuilder` (Mutable)

### **Immutable (String)**
```java
String s = "Hello";
s = s + " World"; // Creates a NEW String object instead of modifying the original
System.out.println(s); // Output: Hello World
```
Here, a **new String object** is created when `" World"` is added. The original `"Hello"` remains unchanged.

### **Mutable (StringBuilder)**
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // Modifies the same object
System.out.println(sb); // Output: Hello World
```
Here, `StringBuilder` **modifies the same object**, avoiding the creation of a new one.

---

## 🚀 Summary
- Use **immutable objects** for **safety, simplicity, and thread safety** (e.g., `String`, `Integer`).  
- Use **mutable objects** for **performance when frequent changes are needed** (e.g., `ArrayList`, `StringBuilder`).  

---
Would you like additional examples or a more detailed explanation? 😊
