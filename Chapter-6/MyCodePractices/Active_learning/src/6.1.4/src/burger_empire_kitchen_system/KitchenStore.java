package burger_empire_kitchen_system;

public class KitchenStore {
    private Burger[] chefs;

    public KitchenStore() {
        this.chefs =new Burger[]{
                new MasterChef("👨‍🍳 Gordon Ramsay", 98, "Head Chef"),
                new GrillMaster("🔥 Jamie Oliver", 89, "Grill Master"),
                new VeganChef("🥑 Priya Sharma", 94, "Vegan Chef"),
                new MasterChef("👨‍🍳 Bobby Flay", 85, "Senior Chef")
        };
    }

    public Burger[] getChefs() {
        return chefs;
    }
}
