একদম ঠিক 👍 এখন আমি **চারটা class/interface মিলিয়ে পুরো সিস্টেম** (Notification System) এর থিওরি → কোড → কনসেপ্ট একসাথে সাজিয়ে ব্যাখ্যা করছি।

---

# 📖 ১. Theory (Core Concept)

### 🔹 Interface Default Methods

* **Core Java (Horstmann, Vol I, Ch. 6):**
  Default methods interface evolution সহজ করে।
  👉 মানে, আপনি যদি কোনো নতুন method (যেমন `logSent()`) interface-এ যোগ করেন, তবুও পুরোনো implementations (যেমন `EmailNotifier`, `SMSNotifier`) automatically fallback behavior পাবে। এতে backward compatibility নষ্ট হয় না।

* **Effective Java (Bloch, Item 20):**
  Default methods কে fallback বা optional behavior হিসেবে ব্যবহার করা উচিত।
  👉 যেমন, সব implementation `retry()` override করতেই হবে না। যদি override না করে, তবে default retry() কাজ করবে।

### 🔹 Design Pattern এখানে ব্যবহৃত

* **Strategy Pattern-এর flavor আছে** → `Notifier` interface define করে behavior, এবং `EmailNotifier`, `SMSNotifier` concrete implementation দেয়।
* Interface evolution + default method ব্যবহার করে future-proof করা হয়েছে।

---

# 📦 ২. Interface: `Notifier`

```java
public interface Notifier {
    void send(String message);

    default void retry(String message) {
        System.out.println("Generic retry attempt for message: " + message);
        send(message);
    }

    default boolean isAvailable() {
        return true;
    }

    default void logSent(String message) {
        System.out.println("Logged: Notification sent - " + message);
    }
}
```

### 🔑 Key Points:

* `send()` → abstract, সবসময় implement করতে হবে।
* `retry()` → default, চাইলে override করা যাবে, না করলে fallback আছে।
* `isAvailable()` → default true রিটার্ন করে।
* `logSent()` → নতুনভাবে interface-এ add হয়েছে (interface evolution এর উদাহরণ)।

---

# 📧 ৩. Class: `EmailNotifier`

```java
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }

    @Override
    public void retry(String message) {
        System.out.println("Specific retry for email: Attempting to resend " + message);
        send(message);
    }

    public boolean isAvailable() {
        return true;
    }

    public void logSent(String message) {
        System.out.println(message);
    }
}
```

### 🔑 Key Points:

* `send()` override → আসল email পাঠানোর simulation।
* `retry()` override → custom retry logic → শুধু message আবার পাঠাচ্ছে।
* `isAvailable()` → default use করতে পারত, কিন্তু নিজে লিখেছে সবসময় true।
* `logSent()` → default ব্যবহার না করে নিজের মতো লিখেছে।

👉 **এখানে মূলত দেখানো হয়েছে কিভাবে default method কে override করে custom behavior বানানো যায়।**

---

# 📱 ৪. Class: `SMSNotifier`

```java
public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }

    public void retry(String message){
        System.out.println(message);
    }

    public boolean isAvailable(){
        return true;
    }

    public void logSent(String message){
        System.out.println(message);
    }
}
```

### 🔑 Key Points:

* `send()` override → SMS পাঠানোর simulation।
* `retry()` → override করেছে কিন্তু logic খুব simple (default এর চাইতে দুর্বল)।
* `isAvailable()` → সবসময় true return করছে।
* `logSent()` → default এর চাইতে simple print দিচ্ছে।

👉 **এখানে মূলত দেখানো হয়েছে কিভাবে default method override করা না করলে fallback behavior পাওয়া যেতো, কিন্তু developer override করেছে নিজের মতো।**

---

# 🖥️ ৫. Class: `NotificationSystem` (Main Class)

```java
public class NotificationSystem {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        System.out.println("Testing EmailNotifier:");
        System.out.println("Is available? " + emailNotifier.isAvailable());
        emailNotifier.send("Hello via Email");
        emailNotifier.retry("Hello via Email");
        emailNotifier.logSent("Hello via Email");
        System.out.println();

        Notifier smsNotifier = new SMSNotifier();
        System.out.println("Testing SMSNotifier:");
        System.out.println("Is available? " + smsNotifier.isAvailable());
        smsNotifier.send("Hello via SMS");
        smsNotifier.retry("Hello via SMS");
        smsNotifier.logSent("Hello via SMS");
        System.out.println();

        System.out.println("Demonstrating interface evolution with logSent():");
        emailNotifier.logSent("Evolution test for Email");
        smsNotifier.logSent("Evolution test for SMS");
    }
}
```

### 🔑 Key Points:

* দুই ধরনের Notifier (`EmailNotifier`, `SMSNotifier`) টেস্ট করা হচ্ছে।
* Default method → কোথাও ব্যবহার হচ্ছে, কোথাও override হচ্ছে।
* Interface evolution → `logSent()` নতুন method add হলেও আগের কোডে কোনো error হয়নি।

---

# 🏆 ৬. Overall Understanding

1. **Interface Evolution:** `logSent()` যোগ করার পরও পুরোনো কোড break হয়নি।
2. **Fallback Behavior:** `retry()` default দিয়ে generic retry করা যায়, না চাইলে override করা যায়।
3. **Customization:** `EmailNotifier` নিজের custom retry দিয়েছে, `SMSNotifier` simple retry দিয়েছে।
4. **Polymorphism:** Main class-এ `Notifier` type ব্যবহার করা হয়েছে, কিন্তু runtime এ আসল object (`EmailNotifier` বা `SMSNotifier`) কাজ করছে।

---

👉 সংক্ষেপে:

* `Notifier` interface → blueprint + কিছু default method.
* `EmailNotifier` → কিছু default override করেছে (custom retry, custom log)।
* `SMSNotifier` → সব override করেছে, কিন্তু চাইলে default use করতে পারত।
* `NotificationSystem` → polymorphism ব্যবহার করে test করেছে।

---

আপনি কি চান আমি **execution-এর sample output**-টাও লিখে দেখাই, যাতে output দেখে পুরো সিস্টেম আরও clear হয়?
