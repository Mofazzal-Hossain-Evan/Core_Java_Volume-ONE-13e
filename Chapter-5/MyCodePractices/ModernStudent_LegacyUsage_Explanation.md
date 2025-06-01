
# ✅ Using LegacyStudent Inside ModernStudent – Explained

In this document, we explain how passing a `LegacyStudent` object to the constructor of a `ModernStudent` works, and why it’s valid.

---

## 🔍 Scenario

You want to migrate legacy student records (`LegacyStudent`) to a modern typed format (`ModernStudent`) using raw ArrayLists.

You can do this using:

```java
ModernStudent ms = new ModernStudent(ls); // ✅ Passing whole LegacyStudent object
```

---

## ✅ How it works

### 1. LegacyStudent Object

```java
LegacyStudent ls = new LegacyStudent("Rahim", 101);
```

This is a raw student record with name and roll.

---

### 2. ModernStudent Constructor

```java
public ModernStudent(LegacyStudent legacyStudent) {
    this.legacyStudent = legacyStudent;
}
```

We store the `LegacyStudent` object inside the `ModernStudent` class.

---

### 3. toString() in ModernStudent

```java
@Override
public String toString() {
    return "Student{name='" + legacyStudent.getName() + "', roll=" + legacyStudent.getRoll() + "}";
}
```

We fetch the values directly from the stored `LegacyStudent` object.

---

### 4. Usage

```java
System.out.println(ms);
```

Output will be:

```
Student{name='Rahim', roll=101}
```

---

## 🧪 Full Example

```java
package VintageStudentRecordMigration;

class LegacyStudent {
    private String name;
    private int roll;

    public LegacyStudent(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }
}

class ModernStudent {
    private LegacyStudent legacyStudent;

    public ModernStudent(LegacyStudent legacyStudent) {
        this.legacyStudent = legacyStudent;
    }

    @Override
    public String toString() {
        return "Student{name='" + legacyStudent.getName() + "', roll=" + legacyStudent.getRoll() + "}";
    }
}

public class University_of_Weird_Majors.Main {
    public static void main(String[] args) {
        LegacyStudent ls = new LegacyStudent("Rahim", 101);
        ModernStudent ms = new ModernStudent(ls);
        System.out.println(ms);
    }
}
```

---

## ✅ Summary

| Concept | Explanation |
|--------|-------------|
| Constructor | Takes a `LegacyStudent` object |
| Object Storage | Keeps reference to legacy object |
| toString | Delegates display using legacy object |
| Benefits | Simple, reusable, and flexible migration |

---

Enjoy smooth legacy-to-modern Java transitions! 🚀
