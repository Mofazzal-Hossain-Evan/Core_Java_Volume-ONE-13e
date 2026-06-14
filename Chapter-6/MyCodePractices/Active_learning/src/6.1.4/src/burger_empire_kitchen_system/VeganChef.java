package burger_empire_kitchen_system;

public final class VeganChef extends Burger implements BurgerMaker{
    public VeganChef(String name, int qualityScore, String chefRank) {
        super(name, qualityScore, chefRank);
    }

    @Override
    public String getSpeciality() {
        return "🥑 Plant Based";
    }



    @Override
    public void prepareBurger(String customer) {
        System.out.println("🥑 " + name + " crafting vegan burger for " + customer);
    }

    @Override
    public void addToppings(String toppings) {
        System.out.println("🌱 Fresh " + toppings + " added");
    }

    @Override
    public BurgerMaker trainNewChef() {
        return new VeganChef("Vegan Intern", qualityScore - 12, "Intern");
    }

}