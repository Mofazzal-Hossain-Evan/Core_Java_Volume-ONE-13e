package Coffee_Strength;

public enum CoffeeStrength {
    DECAF("Do you even coffee?"),
    MILD("Beginner mode"),
    STRONG("Real programmer's fuel"),
    ESPRESSO_SHOT("You won’t sleep tonight");

    private String Mood;

    CoffeeStrength(String ability) {
        this.Mood = ability;
    }



    public String getMood() {
        return Mood;
    }
}
