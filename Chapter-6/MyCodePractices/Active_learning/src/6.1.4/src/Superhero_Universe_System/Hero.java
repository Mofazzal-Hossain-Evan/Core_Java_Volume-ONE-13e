package Superhero_Universe_System;

public abstract non-sealed class Hero implements SuperBehavior  {
    protected String name;
    protected int powerLevel;
    protected int health;
    protected String heroClass;

    public Hero(String name, int powerLevel, int health, String heroClass) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.health = health;
        this.heroClass = heroClass;
    }

    @Override
    public String getHeroClass() {
        return heroClass;
    }

    public abstract String getHeroType();


    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                ", health=" + health +
                ", heroClass='" + heroClass + '\'' +
                '}';
    }
}
