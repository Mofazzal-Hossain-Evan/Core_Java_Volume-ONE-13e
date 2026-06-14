package burger_empire_kitchen_system;


public sealed interface BurgerBehavior permits BurgerMaker, Burger {
    String getChefRank();
}
