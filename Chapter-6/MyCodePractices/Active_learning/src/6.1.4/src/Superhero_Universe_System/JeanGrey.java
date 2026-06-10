package Superhero_Universe_System;

public final class JeanGrey extends Hero
        implements Flyable, Telepathic, Comparable<JeanGrey> {

    public JeanGrey(String name, int powerLevel,
                    int health, String heroClass) {
        super(name, powerLevel, health, heroClass);
    }

    @Override public String getHeroType() { return "🔴 JeanGrey"; }

    @Override
    public void usePower(String target) {
        System.out.println("🔴✨ " + name +
                " → Phoenix Force on " + target + "! 🔥");
    }

    @Override
    public void recharge(int energy) {
        System.out.println("🌅 " + name +
                " → Phoenix reborn: +" + energy + " 🔥");
    }

    @Override
    public void fly(double height) {
        System.out.println("✨ " + name +
                " → Levitating at " + height + "m 🔴");
    }

    @Override
    public void readMind(String target) {
        System.out.println("💭 " + name +
                " → Sensing " + target + "'s emotions ❤️");
    }

    @Override
    public void controlMind(String target) {
        System.out.println("🎯 " + name +
                " → " + target + " under Phoenix control! 🔴✅");
    }

    @Override
    public Powered getSidekick() {
        return new JeanGrey("🐦 Dark Phoenix",
                powerLevel + 5000, health, "Cosmic");
    }

    @Override
    public int compareTo(JeanGrey other) {
        return Integer.compare(powerLevel, other.powerLevel);
    }
}