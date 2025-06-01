package InternetCaféSessionCounter;

public class UserSession {

    private static int activeSessions = 0;

    public void userSession(){
        activeSessions++;
    }

    public void endSession(){
        activeSessions--;
    }

    public static int getActiveSessions() {
        return activeSessions;
    }


}
