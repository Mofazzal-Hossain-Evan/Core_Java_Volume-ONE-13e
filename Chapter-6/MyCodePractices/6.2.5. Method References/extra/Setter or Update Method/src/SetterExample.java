import java.time.LocalDate;

class User {
    String name;
    LocalDate lastLogin;

    User(String name) {
        this.name = name;
        this.lastLogin = LocalDate.of(2020, 1, 1);
    }

    // Setter / updater method
    public void updateLastLogin() {
        this.lastLogin = LocalDate.now();
    }

    @Override
    public String toString() {
        return name + " (lastLogin: " + lastLogin + ")";
    }
}

public class SetterExample {
    public static void main(String[] args) {
        User u = new User("Bob");

        // Lambda (forEach / Stream) বা অন্য কোনো context
        u.updateLastLogin(); // Allowed

        System.out.println(u);
    }
}
