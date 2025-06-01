package EmployeeManagementSystem;

public class EmployeeManagement {
    public static void main(String[] args) {

        Employee[] staff = new Employee[4];

        staff[0] = new Manager("Alice", 80000, 5000);
        staff[1] = new Developer("Bob", 60000, "Java");
        staff[2] = new Intern("Charlie", 20000, 6);

        for (Employee emp : staff) {
            emp.displayInfo();
        }

        // Type Casting Example
        if (staff[0] instanceof Manager){
            Manager m = (Manager) staff[0];

            /*
            ব্যাখ্যা:
            instanceof চেক করা হচ্ছে:

            staff[0] instanceof Manager মানে হল staff[0] অবজেক্টটি Manager ক্লাসের ইনস্ট্যান্স কিনা তা যাচাই করা।

            এটি Runtime Type Checking নিশ্চিত করে, যাতে অবৈধ টাইপ কাস্টিং থেকে ClassCastException এড়ানো যায়।

            Type Casting করা হচ্ছে:

            Manager m = (Manager) staff[0]; এই লাইনে staff[0] কে Manager টাইপে কাস্ট করা হয়েছে।

            যেহেতু staff[0] আগে থেকেই Manager টাইপের অবজেক্ট (যেমন staff[0] = new Manager(...)), তাই এটি বৈধ।

            কেন করা হয়?

                    staff[0] একটি Employee টাইপের অ্যারে এলিমেন্ট, তাই সরাসরি Manager-এর মেথড (যেমন setBonus()) কল করা যাবে না।

            কাস্টিং করলে এটি Manager হিসাবে কাজ করবে, এবং setBonus() এর মতো Manager-এর নিজস্ব মেথড অ্যাক্সেস করা সম্ভব হবে।

            বিকল্প উদাহরণ:
            নিচের মতো Type Casting ছাড়া সরাসরি setBonus() কল করা গেলে কম্পাইল টাইম ত্রুটি হবে:


            staff[0].setBonus(5000); // ERROR: setBonus() method is not found in Employee
            কিন্তু instanceof চেক করার পর কাস্ট করলে এটি কাজ করবে:

            java
                    Copy
            Edit
            if (staff[0] instanceof Manager) {
                Manager m = (Manager) staff[0];
                m.setBonus(5000); // Now it works
            }
            সংক্ষেপে:
✅ instanceof দিয়ে সঠিক টাইপ চেক করে নেয়া হচ্ছে
✅ Type Casting এর মাধ্যমে Manager এর মেথড অ্যাক্সেস করা হচ্ছে
✅ Polymorphism এবং Safe Type Casting নিশ্চিত করা হচ্ছে

            */
            m.setBonus(7000);
            m.displayInfo();
        }

        // Array Covariance Issue Example
        Manager[] managers = new Manager[2];
        managers[0] = new Manager("David", 90000, 8000);
        Employee[] employees = managers;

        // This will cause a runtime error: ArrayStoreException
        // employees[1] = new Employee("Eve", 50000);
    }
}
