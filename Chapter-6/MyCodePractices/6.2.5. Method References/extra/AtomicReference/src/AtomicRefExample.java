import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicReference;

class User {
    String name;
    LocalDate lastLogin;

    User(String name) {
        this.name = name;
        this.lastLogin = LocalDate.of(2020, 1, 1);
    }

    @Override
    public String toString() {
        return name + " (lastLogin: " + lastLogin + ")";
    }
}

public class AtomicRefExample {
    public static void main(String[] args) {
        User user = new User("Alice");

        // AtomicReference wrapper
        AtomicReference<User> userRef = new AtomicReference<>(user);

        // Lambda inside Runnable (can modify AtomicReference)
        Runnable update = () -> {
            User u = userRef.get();
            u.lastLogin = LocalDate.now(); // Allowed
            userRef.set(u); // update reference if needed
        };

        update.run();

        System.out.println(userRef.get());
    }
}
