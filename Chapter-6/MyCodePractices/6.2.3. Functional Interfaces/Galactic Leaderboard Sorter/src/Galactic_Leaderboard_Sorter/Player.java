package Galactic_Leaderboard_Sorter;

public class Player {
    private String nickname;
    private int score;
    private int level;

    public Player(String nickname, int score, int level) {
        this.nickname = nickname;
        this.score = score;
        this.level = level;
    }

    public String getNickname() {
        return nickname;
    }

    public int getScore() {
        return score;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", score=" + score +
                ", level=" + level +
                '}';
    }
}
