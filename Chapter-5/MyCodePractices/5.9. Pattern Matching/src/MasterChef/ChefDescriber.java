package MasterChef;

public class ChefDescriber {
    public static String describeChef(Chef c){
        return switch (c){
            case HeadChef h -> "👨‍🍳 Head Chef: " + h.getSignatureDish() + " | Style: " + h.getStyle();
            case PastryChef p -> "🍰 Pastry Chef: " + p.getSignatureDish() + " | Style: " + p.getStyle();
            case SousChef s -> "🧂 Sous Chef: " + s.getSignatureDish() + " | Style: " + s.getStyle();
            case InternChef i -> "🔥 Intern Chef: " + i.getSignatureDish() + " | Style: " + i.getStyle();
            case Chef __ -> "❓ Unknown chef is experimenting with something strange...";
        };
    }

    public static String describeTaste(Chef c){
        String taste = "Neutral";
        switch (c){
            case HeadChef h:
                taste = "Spicy";
                break;
            case PastryChef p:
                taste = "Sweet";
                break;
            default:
                break;
        }
        return "Taste Style: " + taste;
    }
}
