package ArcadeTokenManagementSystem;

public class PlayerTokenUsage {
    private String playerName;
    private String gameName;
    private int tokensUsed;

    public PlayerTokenUsage(String playerName, String gameName, int tokensUsed) {
        this.playerName = playerName;
        this.gameName = gameName;
        this.tokensUsed = tokensUsed;
    }
    public void setTokensUsed(int tokenUsed){
        this.tokensUsed = tokensUsed;
    }

    public String getPlayerName(){
        return playerName;
    }
    public String toString() {
        return "👤 " + playerName + " played " + gameName + " using " + tokensUsed + " tokens";
    }
}
