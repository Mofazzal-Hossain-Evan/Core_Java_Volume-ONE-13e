/* Package declaration */
package User_Profile_Matcher;

/* থিয়রি: *Core Java* (p. 274) বলে, POJO ক্লাস প্রোফাইল হোল্ড করে, যা ল্যামডা দিয়ে জেনারেট করা যায়। */

public class UserProfile {
    private String username;
    private int activityLevel;

    public UserProfile(String username, int activityLevel) {
        this.username = username;
        this.activityLevel = activityLevel;
    }

    // Getters and Setters
    public String getUsername() { return username; }
    public int getActivityLevel() { return activityLevel; }
    public void setActivityLevel(int activityLevel) { this.activityLevel = activityLevel; }

    @Override
    public String toString() {
        return username + " | Activity Level: " + activityLevel;
    }
}