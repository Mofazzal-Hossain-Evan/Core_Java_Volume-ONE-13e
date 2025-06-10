package core;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class Event {
    private String title;
    private LocalDateTime dateTime;
    protected Character participant;

    public Event(String title, LocalDateTime dateTime, Character participant) {
        this.title = title;
        this.dateTime = dateTime;
        this.participant = participant;
    }

    // ব্যাখ্যা: performAction রিফ্লেকশন ব্যবহার করে ইভেন্টের ক্রিয়া (action) কল করে।
    public void performAction(String actionName, Object... args) throws ReflectiveOperationException {
        Method method = this.getClass().getMethod(actionName, getParameterTypes(args));
        method.invoke(this, args);
    }

    // ব্যাখ্যা: displayDetails ইভেন্টের তথ্য প্রদর্শন করে।
    public void displayDetails() {
        System.out.println("Event: " + title + " at " + dateTime);
    }

    // ব্যাখ্যা: getParameterTypes আর্গুমেন্টের টাইপ নির্ধারণ করে।
    private Class<?>[] getParameterTypes(Object... args) {
        Class<?>[] types = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            types[i] = args[i].getClass();
        }
        return types;
    }

    // Getter
    public LocalDateTime getDateTime() { return dateTime; }
}