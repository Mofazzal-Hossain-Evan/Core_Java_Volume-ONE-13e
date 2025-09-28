package Mini_To_Do_List;

import java.util.*;

public class TodoListApp {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Finish Java homework", false));
        tasks.add(new Task("Debug the Matrix", true));
        tasks.add(new Task("Feed the Code Gremlins", false));
        tasks.add(new Task("Read Lambda chapter", true));

        System.out.println("All Tasks:");
        tasks.forEach(System.out::println);

        // ✅ Completed টাস্কগুলো ফিল্টার
        System.out.println("\nCompleted Tasks:");
        tasks.stream()
                .filter(task -> task.completed)
                .forEach(System.out::println);

        // ❌ Pending টাস্কগুলো ফিল্টার
        System.out.println("\nPending Tasks:");
        tasks.stream()
                .filter(task -> !task.completed)
                .forEach(System.out::println);

        // 🔍 টাইটেল অনুযায়ী ফিল্টার (যেমন "Java" আছে এমন টাস্ক)
        System.out.println("\nTasks with 'Java' in title:");
        tasks.stream()
                .filter(task -> task.title.contains("Java"))
                .forEach(System.out::println);
    }
}
/***
 ঠিক আছে 👍 তুমি যে অংশটা শিখতে চাইছো সেটা মূলত **Java Streams API + Lambda Expressions** ব্যবহার করে ফিল্টার করার পদ্ধতি। আস্তে আস্তে ব্রেকডাউন করি।

 ---

 ## 🔹 কোড ব্লক

 ```java
 // ✅ Completed টাস্কগুলো ফিল্টার
 System.out.println("\nCompleted Tasks:");
 tasks.stream()
 .filter(task -> task.completed)
 .forEach(System.out::println);

 // ❌ Pending টাস্কগুলো ফিল্টার
 System.out.println("\nPending Tasks:");
 tasks.stream()
 .filter(task -> !task.completed)
 .forEach(System.out::println);

 // 🔍 টাইটেল অনুযায়ী ফিল্টার (যেমন "Java" আছে এমন টাস্ক)
 System.out.println("\nTasks with 'Java' in title:");
 tasks.stream()
 .filter(task -> task.title.contains("Java"))
 .forEach(System.out::println);
 ```

 ---

 ## 🔹 ধাপে ধাপে ব্যাখ্যা

 ### 1. `tasks.stream()`

 👉 `tasks` হলো `ArrayList<Task>`
 👉 `.stream()` মানে হলো লিস্টটাকে **স্ট্রিমে রূপান্তর করা** যাতে আমরা ফিল্টার, ম্যাপ, সোর্ট, ইত্যাদি করতে পারি।

 ---

 ### 2. `.filter(task -> task.completed)`

 👉 এখানে `filter` মানে **শুধু সেই টাস্কগুলো রাখো যেগুলো শর্ত পূরণ করে।**
 👉 `task -> task.completed` হলো একটি **lambda expression**
 মানে:

 * প্রতিটি `task` অবজেক্ট নাও
 * যদি তার `completed == true` হয় তবে রাখো

 ---

 ### 3. `.forEach(System.out::println)`

 👉 ফিল্টার করার পর প্রতিটি টাস্ককে প্রিন্ট করো।
 👉 `System.out::println` হলো **method reference** যা লিখতে `task -> System.out.println(task)` এর সমান।

 ---

 ### 4. `.filter(task -> !task.completed)`

 👉 `!task.completed` মানে হলো **যেসব টাস্ক শেষ হয়নি (false)** শুধু সেগুলো রাখো।
 👉 এভাবে Pending টাস্কগুলো বের হয়।

 ---

 ### 5. `.filter(task -> task.title.contains("Java"))`

 👉 এখানে ফিল্টার করা হচ্ছে **শিরোনামে “Java” শব্দ আছে কিনা**।
 👉 `String.contains("Java")` মানে হলো সাবস্ট্রিং খোঁজা।
 যেমন:

 * `"Learn Java Basics".contains("Java") ✅ true`
 * `"Go to Gym".contains("Java") ❌ false`

 ---

 ## 🔹 আউটপুট কেমন হবে (উদাহরণ)

 ধরি আমাদের লিস্টে এই টাস্কগুলো আছে:

 ```java
 [Task: Learn Java Basics (Completed),
 Task: Finish Homework (Pending),
 Task: Advanced Java Project (Completed)]
 ```

 👉 আউটপুট হবে:

 ```
 Completed Tasks:
 Learn Java Basics (Completed)
 Advanced Java Project (Completed)

 Pending Tasks:
 Finish Homework (Pending)

 Tasks with 'Java' in title:
 Learn Java Basics (Completed)
 Advanced Java Project (Completed)
 ```

 ---

 চাইলে আমি তোমাকে **step-by-step কোড লিখে চালানো দেখাতে পারি** — যেমন প্রথমে শুধু Completed filter, তারপর Pending, তারপর Title filter আলাদা আলাদা করে।

 তুমি কি সেটা দেখতে চাও?



 ***/