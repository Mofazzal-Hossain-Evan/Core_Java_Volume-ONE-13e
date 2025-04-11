Java: The `hashCode()` Method Explained in Bengali
--------------------------------------------------

### 9 1. `hashCode()` কী?

* এটি একটি **int** যেনেরেটার ফলাফল যা একটি object থেকে উত্পন্ন করা হাশ কোড।

* উদ্দেশ্য: ভিন্ন object গুলোর জন্য hash ভিন্ন হোয়।

### 9 2. `String` ক্লাসে `hashCode()`

#### অ্যালগরিদম:

    int hash = 0;
    for (int i = 0; i < length(); i++)
       hash = 31 * hash + charAt(i);

#### উদাহরণ (Table 5.1):

| String | Hash Code   |
| ------ | ----------- |
| Hello  | 69609650    |
| Harry  | 69496448    |
| Hacker | -2141031506 |

### 9 3. Default `hashCode()` (Object class)

* মেমোরি অ্যাড্রেস থেকে ভিত্তি করে hashCode এর কাজ করে।

#### উদাহরণ (Table 5.2):

    var s = "Ok";
    var sb = new StringBuilder(s);
    System.out.println(s.hashCode() + " " + sb.hashCode());
    
    var t = new String("Ok");
    var tb = new StringBuilder(t);
    System.out.println(t.hashCode() + " " + tb.hashCode());

| Object | Hash Code | Object | Hash Code |
| ------ | --------- | ------ | --------- |
| s      | 2556      | t      | 2556      |
| sb     | 20526976  | tb     | 20527144  |

### 9 4. `equals()` override করলে `hashCode()` override করা আবশ্য।

#### কারণ না করলে কি হবে?

* Hash-based collections (জেমন: `HashSet`, `HashMap`) চিন্ন কার্য নির্ভরর `equals()` এবং `hashCode()` সটিক না হোলে, তাহলে object দুদি বার প্রবেশ কোরা হবে।

### ὓ9 5. Custom class: `Employee.hashCode()`

    public class Employee {
       public int hashCode() {
          return 7 * name.hashCode()
               + 11 * Double.valueOf(salary).hashCode()
               + 13 * hireDay.hashCode();
       }
    }

### 9 6. Better version:

    public int hashCode() {
       return 7 * Objects.hashCode(name)
            + 11 * Double.hashCode(salary)
            + 13 * Objects.hashCode(hireDay);
    }

### 9 7. Perfect Hash Function:

    // Bad:
    int hash = 7 * year + 11 * month + 13 * day;
    
    // Good:
    int hash = 31 * 12 * year + 31 * month + day;

* এটি কোনো calendar date গুলোকে অন্য্যাতমুক করা হাশকোড দেই।

### 9 8. Simplified hash with `Objects.hash(...)`

    public int hashCode() {
       return Objects.hash(name, salary, hireDay);
    }

### 9 9. Arrays থাকলে:

    Arrays.hashCode(arr); // 1D array
    Arrays.deepHashCode(arr); // 2D or nested array

#### Implementation:

    public static int hashCode(Object[] a) {
       if (a == null) return 0;
       int result = 1;
       for (Object element : a)
          result = 31 * result + (element == null ? 0 : element.hashCode());
       return result;
    }

* নুলল array এর hash = 0

* zero-length array হোলে hash = 1

### ὓ9 10. `Objects.hash(x)` এবং `x.hashCode()`:

    Objects.hash(x) == 31 + x.hashCode()

* বাসতবার নুলসেফ গুণবতা এচার হাশ কোড সৃজন্য।

### 9 11. Record টাইপ:

* Record ক্লাস স্বযংচালীক ভাবে hashCode উৈ জেনেরেট করে।

* JDK 21 এতে সম্পূর্ণ হয়।

* রেকর্ডের সমস্তান ভ্যালুস কম্পোনেন্টের হাশ কোডগুলি 31 দিয়ে গুণ করা হয়।

### ὓ9 12. API Summary:

| Class               | Method            | Description                   |
| ------------------- | ----------------- | ----------------------------- |
| Object              | hashCode()        | Default, memory address based |
| Objects             | hash(...)         | Combines hash codes           |
| Objects             | hashCode(obj)     | Null-safe hashCode            |
| Double, Integer etc | hashCode(value)   | For primitives                |
| Arrays              | hashCode(arr)     | 1D array hash                 |
| Arrays              | deepHashCode(arr) | For nested arrays             |

### 8 সারানি:

* `equals()` বনালে `hashCode()` ও override করতে হবে

* `Objects.hash()` অথবা `Arrays.hashCode()` বেশি উপয়োগী ভাবের কাজ করা

* Record ক্লাস এসবাবে handled

* hashCode() বেশি সময়ে টেস্ট করা উচিত হয়, জেমন ভাবিষ্যতা টুলি গুলে টেস্ট কোরে।

অনুভবুতি প্রশ্ন জানার থাকলে বললে কাছাবে, আমি চেক করবো!
