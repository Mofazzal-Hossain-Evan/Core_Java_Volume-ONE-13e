package TV_BingeMode;

public enum BingeMode {

    CASUAL("1 episode", 45),
    MODERATE("3 episodes", 135),
    HARDCORE("Full season", 540),
    ZOMBIE("Watch till you faint", 999);

    private final String description;
    private final int estimatedMinutes;

    BingeMode(String description, int estimatedMinutes) {
        this.description = description;
        this.estimatedMinutes = estimatedMinutes;
    }

    // Method to get the description
    public String getDescription() {
        return description;
    }

    public String getEstimatedTime(){
        int hours = estimatedMinutes / 60;
        int minutes = estimatedMinutes % 60;
        return hours + " hr " + minutes + "min";
    }

    public String getMessage(){
        return switch (this) {
            case CASUAL -> "Nice and easy 🍵";
            case MODERATE -> "You're warming up 🔥";
            case HARDCORE -> "Binge beast mode activated 🦾";
            case ZOMBIE -> "Uh oh... RIP sleep 🧟‍♂️";
        };
    }

}
