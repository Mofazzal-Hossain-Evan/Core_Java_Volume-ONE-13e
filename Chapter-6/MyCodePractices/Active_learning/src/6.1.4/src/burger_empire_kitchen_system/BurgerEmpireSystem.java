package burger_empire_kitchen_system;

public class BurgerEmpireSystem {

    public static void main(String[] args) {

        KitchenStore store = new KitchenStore();
        Burger[] chefs = store.getChefs();

        System.out.println("🍔 Welcome to Burger Empire! Total Chefs: " + chefs.length + "\n");

        // 1. Static Methods
        System.out.println("=== 1. Static Methods in Interface (6.1.4) ===");
        System.out.println(BurgerMaker.getQualityTier(118));
        System.out.println(BurgerMaker.getQualityTier(110000));
        System.out.println("Is Premium? " + BurgerMaker.isPremium(95));

        BurgerMaker newChef = BurgerMaker.hireChef("vegan");
        System.out.println();

        // 2. Private Methods + DRY

        System.out.println("=== 2. Private + Default Methods + DRY (6.1.4) ===");
        MasterChef gordon = new MasterChef("Gordon", 98, "Head Chef");

        System.out.println(gordon.canMakePerfectBurger(77));
        System.out.println(gordon.getBurgerReview(88));        // default using same private method

        System.out.println();

        // 3. Interface as Type
        System.out.println("=== 3. Interface Variable & Polymorphism ===");
        BurgerMaker chef1 = new MasterChef("Gordon", 98, "Head");
        BurgerMaker chef2 = new VeganChef("Priya", 94, "Vegan");

        chef1.prepareBurger("Alice");
        chef2.prepareBurger("Bob");

        System.out.println("\n🎉 6.1.4 Concepts Mastered through Burger Kitchen! 🍔🔥");


        
    }
}