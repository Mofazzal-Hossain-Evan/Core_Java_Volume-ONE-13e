## Understanding `static` Field Sharing in Java

### What is `static`?
When a field is **declared as `static`**, it belongs **to the class itself**, not to individual objects. This means:

✅ **Only one copy** of the static field exists, no matter how many objects are created.  
✅ **All objects of the class share the same field** and can modify its value.  
✅ Even if no objects exist, the static field still exists because it belongs to the **class, not instances**.

---

### Without `static` (Each Object Has Its Own Copy)
```java
class Example {
    int number = 0; // Instance field (not shared)
}

public class Test {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();

        e1.number = 5; // Changes only e1's number
        e2.number = 10; // Changes only e2's number

        System.out.println(e1.number); // Output: 5
        System.out.println(e2.number); // Output: 10
    }
}
```
🔹 Here, `e1` and `e2` have **separate copies** of `number`, so changing one doesn't affect the other.

---

### With `static` (Shared Field)
```java
class Example {
    static int sharedNumber = 0; // Static field (shared)
}

public class Test {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();

        e1.sharedNumber = 5; // Changes the shared field
        System.out.println(e2.sharedNumber); // Output: 5

        e2.sharedNumber = 10; // Updates the same field
        System.out.println(e1.sharedNumber); // Output: 10
    }
}
```
🔹 Now, `sharedNumber` is a **single field** shared by both `e1` and `e2`, so changing it in one object affects all others.

---

### How Java Stores `static` Fields
- **Instance variables** are stored separately for each object.
- **Static variables** are stored **once per class** in the **"method area" (or "class area")** of memory.

📌 **Even if you create 1000 objects of a class, only one static field exists!**

---

### Visual Representation
#### Without `static` (Separate Copies for Each Object)
```
Object e1: [ number = 5 ]  
Object e2: [ number = 10 ]  
```
Each object has its own copy of `number`.

#### With `static` (Shared Field)
```
Class Example: [ sharedNumber = 10 ]  
Object e1 -> uses sharedNumber  
Object e2 -> uses sharedNumber  
```
All objects refer to the same field in memory.

---

### Practical Example: Employee ID Generator
```java
class Employee {
    static int nextId = 1;  // Shared field
    int id;                 // Unique for each object

    public Employee() {
        id = nextId;   // Assign unique ID
        nextId++;      // Increase shared counter
    }

    public void showId() {
        System.out.println("Employee ID: " + id);
    }
}

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.showId(); // Output: Employee ID: 1
        e2.showId(); // Output: Employee ID: 2
        e3.showId(); // Output: Employee ID: 3
    }
}
```
🔹 The **static field `nextId`** ensures each employee gets a unique ID.

---

## Key Takeaways
✔ **Static fields belong to the class, not objects.**  
✔ **Only one copy exists, shared by all instances.**  
✔ **Changes made by one object affect all others.**  
✔ **Can be accessed using `ClassName.fieldName` or `objectName.fieldName`.**

---
