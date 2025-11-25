package User_Profile_Comparator;

import java.time.LocalDate;

public class User {

    private String userName;
    private LocalDate joinDate;
    private LocalDate lastLogin;

    public User(String userName, LocalDate joinDate, LocalDate lastLogin) {
        this.userName = userName;
        this.joinDate = joinDate;
        this.lastLogin = lastLogin;
    }

    public boolean isInactive(){
        return lastLogin.isBefore((LocalDate.now().minusDays(90)));

    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", joinDate=" + joinDate +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
