package equalityProject.flexible;

public class MyObject {
    public boolean equals(Object other){
        return this == other;
    }

    public int hashCode(){
        return System.identityHashCode(this);
        //মানে: ➡️ বর্তমান অবজেক্ট (this) এর unique reference/hashCode ফেরত দাও,
        // যা JVM নিজে জেনারেট করে।

        //এটা override করা hashCode() থেকে আলাদা। যদি তুমি hashCode() override না করো, তাহলে Java default হিসেবে এটাকেই ব্যবহার করে।
    }

    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
