package burger_empire_kitchen_system;

public final class MasterChef extends Burger implements BurgerMaker{
    public MasterChef(String name, int qualityScore, String chefRank) {
        super(name, qualityScore, chefRank);
    }

    @Override
    public String getSpeciality() {
        return "🍔 Classic Beef";
    }


    @Override
    public void prepareBurger(String customer) {
        System.out.println("👨‍🍳 " + name + " is preparing burger for " + customer);
    }

    @Override
    public void addToppings(String toppings) {
        System.out.println("🧂 Added " + toppings + " perfectly!");
    }

    @Override
    public BurgerMaker trainNewChef() {

        return new MasterChef("Junior " + name, qualityScore - 15, "Apprentice");
    }
}
