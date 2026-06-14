package burger_empire_kitchen_system;



public non-sealed interface BurgerMaker extends BurgerBehavior {

    void prepareBurger(String customer);
    void addToppings(String toppings);
    BurgerMaker trainNewChef();

    // =====================
    // 6.1.4 — Static Methods
    // =====================
    static String getQualityTier(int qualityScore) {

        return getTierName(qualityScore);
    }

    // Default + Private Methods (DRY Example)
    default boolean canMakePerfectBurger(int score) {
        return checkQuality(score);
    }

    default String getBurgerReview(int score) {
        if (checkQuality(score)) {
            return "🌟 Perfect Burger!";
        } else {
            return "🍔 Needs improvement";
        }
    }



    static boolean isPremium(int qualityScore) {
        return checkPremium(qualityScore);
    }

    private boolean checkQuality(int score) {
        return score >= 90;
    }

    // Factory Method
    static BurgerMaker hireChef(String type) {
        return switch (type.toLowerCase()) {
            case "master" -> new MasterChef("👨‍🍳 Gordon", 95, "Head Chef");
            case "grill"  -> new GrillMaster("🔥 Jamie", 88, "Grill Expert");
            case "vegan"  -> new VeganChef("🥑 Priya", 92, "Vegan Specialist");
            default       -> new MasterChef(type, 70, "Junior Chef");
        };
    }

    // =====================
    // Private Static Helpers
    // =====================
    private static boolean checkPremium(int score) {
        return score >= 90;
    }

    private static String getTierName(int score) {
        if (score >= 95) return "🌟 LEGENDARY";
        else if (score >= 85) return "🔥 MASTER";
        else if (score >= 75) return "🍔 PRO";
        else return "🌱 BEGINNER";
    }
}