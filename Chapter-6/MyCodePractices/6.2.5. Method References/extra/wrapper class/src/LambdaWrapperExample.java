import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class User {
    String name;
    LocalDate lastLogin;

    User(String name) {
        this.name = name;
        this.lastLogin = LocalDate.of(2020, 1, 1); // initial date
    }

    @Override
    public String toString() {
        return name + " (lastLogin: " + lastLogin + ")";
    }
}

// Wrapper class to allow mutation inside lambda
class MutableUser {
    User user;
    MutableUser(User u) { this.user = u; }

    @Override
    public String toString() {
        return user.toString();
    }
}

public class LambdaWrapperExample {
    public static void main(String[] args) {
        // Original User list
        List<User> users = Arrays.asList(
                new User("Alice"),
                new User("Bob"),
                new User("Charlie")
        );

        System.out.println("Original Users:");
        users.forEach(System.out::println);

        // Attempt to modify inside lambda - not allowed
        // users.forEach(u -> u.lastLogin = LocalDate.now()); // ❌ compilation error

        // Correct way: wrap each User in MutableUser
        List<MutableUser> mutableUsers = users.stream()
                .map(MutableUser::new)
                .collect(Collectors.toList());

        // Now we can modify safely
        mutableUsers.forEach(mu -> mu.user.lastLogin = LocalDate.now());

        System.out.println("\nMutable Users after updating lastLogin:");
        mutableUsers.forEach(System.out::println);

        // ASCII Diagram
        System.out.println("\nASCII Diagram of Mapping:");
        System.out.println(
                "users:           [User1, User2, User3]\n" +
                        "                 | map(MutableUser::new)\n" +
                        "mutableUsers:    [MutableUser(User1), MutableUser(User2), MutableUser(User3)]\n" +
                        "                 Each MutableUser wraps original User and is mutable."
        );
    }
}
