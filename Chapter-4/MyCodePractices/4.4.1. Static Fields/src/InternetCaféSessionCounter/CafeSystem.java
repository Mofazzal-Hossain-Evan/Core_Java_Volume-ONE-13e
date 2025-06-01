package InternetCaféSessionCounter;

public class CafeSystem {
    public static void main(String[] args) {
        UserSession u2 = new UserSession();
        UserSession u1 = new UserSession();

        System.out.println("Active users: " + UserSession.getActiveSessions());

        u1.endSession();
        System.out.println("Active users after one logout: " + UserSession.getActiveSessions());
    }
}
