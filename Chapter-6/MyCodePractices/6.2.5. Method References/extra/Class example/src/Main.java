class User {
    String name;
}

class MutableUser {
    User user;

    MutableUser(User u) {
        this.user = u;
    }
}

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Rahim";

        MutableUser mu = new MutableUser(u1);

        System.out.println(u1.name);      // Rahim
        System.out.println(mu.user.name); // Rahim

        mu.user.name = "Karim";
        System.out.println(u1.name); // Karim

    }
}
