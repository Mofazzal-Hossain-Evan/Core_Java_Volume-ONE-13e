package Superhero_Universe_System;

public class Thor extends Hero implements Flyable, Comparable<Thor> {
    public Thor(String name, int powerLevel, int health, String heroClass) {
        super(name, powerLevel, health, heroClass);
    }

    @Override public String getHeroType() { return "⚡ Thor"; }

    @Override
    public void usePower(String target) {
        System.out.println("⚡ " + name +
                " → MJOLNIR strikes " + target + "! 🔨⚡");
    }

    @Override
    public void recharge(int energy) {
        System.out.println("🌩️ " + name +
                " → Lightning absorbed: " + energy + " bolts ⚡");
    }

    @Override
    public void fly(double height) {
        System.out.println("🌩️ " + name +
                " → Soaring at " + height + "m! ⚡🔨");
    }

    @Override
    public Powered getSidekick() {
        return new Thor("🪓 Loki",
                powerLevel - 3000, health - 30, "Asgardian");
    }

    @Override
    public int compareTo(Thor other) {
        return Integer.compare(powerLevel, other.powerLevel);
    }
}
