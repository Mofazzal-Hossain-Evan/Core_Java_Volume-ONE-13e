/* Package declaration */
package Scoreboard_Generator;

/* থিয়রি: *Core Java* (p. 274) বলে, POJO ক্লাস স্কোর হোল্ড করে, যা ল্যামডা দিয়ে জেনারেট করা যায়। */

public class ScoreEntry {
    private String playerName;
    private int score;

    public ScoreEntry(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    // Getters
    public String getPlayerName() { return playerName; }
    public int getScore() { return score; }

    // Setter for score (if needed)
    public void setScore(int score) { this.score = score; }

    @Override
    public String toString() {
        return playerName + " | Score: " + score;
    }
}