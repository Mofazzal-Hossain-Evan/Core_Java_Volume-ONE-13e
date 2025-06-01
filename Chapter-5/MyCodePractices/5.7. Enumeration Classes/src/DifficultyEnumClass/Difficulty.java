package DifficultyEnumClass;

public enum Difficulty {
    EASY("Just Relax 😌"),
    MEDIUM("Bit Sweaty 😅"),
    HARD("Git Gud 💪"),
            NIGHTMARE("Say Goodbye to Sleep 😈");
    private final String description;

    Difficulty(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    @Override
    public String toString(){
        return name() + " - " + description;
    }
}
