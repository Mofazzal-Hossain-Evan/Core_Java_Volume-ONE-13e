package RetroGameScoreboard;

public class GameScore  {

    public String playerName;
    private int level;
    private int score;
    private String timeTaken;

    public GameScore(String playerName, int level, int score, String timeTaken) {
        this.playerName = playerName;
        this.level = level;
        this.score = score;
        this.timeTaken = timeTaken;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(String timeTaken) {
        this.timeTaken = timeTaken;
    }

    @Override
    public String toString() {
        return "🎮 " +
                "playerName='" + playerName + '\'' +
                ", level=" + level +
                ", score=" + score +
                ", timeTaken='" + timeTaken + '\''
                ;
    }
}
