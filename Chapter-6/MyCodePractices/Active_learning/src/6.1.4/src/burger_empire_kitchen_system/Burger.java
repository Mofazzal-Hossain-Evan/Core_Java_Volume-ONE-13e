package burger_empire_kitchen_system;

public abstract non-sealed class Burger implements BurgerBehavior{

    protected String name;
    protected int qualityScore;
    protected String chefRank;

    public Burger(String name, int qualityScore, String chefRank) {
        this.name = name;
        this.qualityScore = qualityScore;
        this.chefRank = chefRank;
    }

    public String getName() {
        return name;
    }

    public int getQualityScore() {
        return qualityScore;
    }

    @Override
    public String getChefRank() {
        return chefRank;
    }

    public abstract String getSpeciality();
}

