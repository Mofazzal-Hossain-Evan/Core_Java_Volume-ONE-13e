package Superhero_Universe_System;


public final class ProfX extends Hero
        implements Telepathic, Comparable<ProfX> {

    public ProfX(String name, int powerLevel,
                 int health, String heroClass) {
        super(name, powerLevel, health, heroClass);
    }

    @Override public String getHeroType() { return "🧠 ProfX"; }

    @Override
    public void usePower(String target) {
        System.out.println("🧠 " + name +
                " → Cerebro locked on: " + target + " 📡");
    }

    @Override
    public void recharge(int energy) {
        System.out.println("💆 " + name +
                " → Meditating: +" + energy + " psi 🧘");
    }

    @Override
    public void readMind(String target) {
        System.out.println("🔍 " + name +
                " → Reading " + target + "'s thoughts 💭");
    }

    @Override
    public void controlMind(String target) {
        System.out.println("🎯 " + name +
                " → " + target + " controlled! 🧠✅");
    }

    @Override
    public Powered getSidekick() {
        return new ProfX("🔴 Cyclops",
                powerLevel - 2000, health, "Mutant");
    }

    @Override
    public int compareTo(ProfX other) {
        return Integer.compare(powerLevel, other.powerLevel);
    }
}
