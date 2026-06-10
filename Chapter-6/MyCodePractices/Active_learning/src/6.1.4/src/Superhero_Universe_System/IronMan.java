package Superhero_Universe_System;

public final class IronMan extends Hero
 implements Flyable, Blastable, Comparable<IronMan> {
    public IronMan(String name, int powerLevel, int health, String heroClass) {
        super(name, powerLevel, health, heroClass);
    }

    @Override
    public String getHeroType() {
        return "IronMan";
    }


    @Override
    public void blast(String target, double power) {
        if (power > MAX_BLAST){
            System.out.println("💥 " + name +
                    " → Unibeam OVERLOAD! ❌");
        } else {
            System.out.println("🔴 " + name +
                    " → Unibeam → " + target +
                    " [" + power + " TW] 💥");
        }
    }

    @Override
    public void fly(double height) {

        if (!canFlyHigh(height)) {
            System.out.println("🚨 " + name +
                    " → Too high: " + height + "m ❌");
        } else {
            System.out.println("🚀 " + name +
                    " → Flying at " + height + "m ✅");
        }
    }

    @Override
    public void usePower(String target) {
        System.out.println("🦾 " + name +
                " → JARVIS, target locked: " + target + " 🎯");
    }

    @Override
    public void recharge(int energy) {
        System.out.println("⚡ " + name +
                " → Arc reactor: " + energy + "% 🔋");

    }

    @Override
    public Powered getSidekick() {
        return new IronMan("🤖 War Machine",
                powerLevel - 2000, health - 20, heroClass);
    }

    @Override
    public int compareTo(IronMan object) {
        return Integer.compare(this.powerLevel, object.powerLevel);
    }
}
