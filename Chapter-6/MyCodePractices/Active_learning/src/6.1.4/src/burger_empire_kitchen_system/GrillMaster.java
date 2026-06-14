package burger_empire_kitchen_system;

public final class GrillMaster extends Burger implements BurgerMaker {

    public GrillMaster(String name, int qualityScore, String chefRank) {
        super(name, qualityScore, chefRank);
    }

    @Override
    public String getSpeciality() {
        return "🔥 Flame Grilled";
    }



    @Override
    public void prepareBurger(String customer) {
        System.out.println("🔥 " + name + " grilling burger for " + customer);
    }

    @Override
    public void addToppings(String toppings) {
        System.out.println("🔥 Perfectly charred with " + toppings);
    }

    @Override
    public BurgerMaker trainNewChef() {
        return new GrillMaster("Grill Trainee", qualityScore - 10, "Trainee");
    }
}