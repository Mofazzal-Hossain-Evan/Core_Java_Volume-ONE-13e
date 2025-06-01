package Juice_Flavor_Judge;

public enum JuiceFlavor {
    MANGO("King of Juices"),
    ORANGE("Vitamin C Master"),
    LITCHI("Fancy but sweet"),
    BITTER_GOURD("Why tho?");

    private final String judgement;

   JuiceFlavor(String judgement) {
        this.judgement = judgement;
    }

    public String getJudgement() {
        return judgement;
    }
}
