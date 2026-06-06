package MysticGuild;

public final class Gandalf extends Mystic
        implements Flyable, Comparable<Gandalf> {

    public Gandalf(String name, int mana, int wisdom, String guildRank) {
        super(name, mana, wisdom, guildRank);
    }

    @Override public String getMysticType() { return "🔮 Gandalf"; }

    @Override public void castSpell(String target) {
        System.out.println("🔮 " + name + " → You shall not pass, " + target + "! ⚔️");
    }

    @Override public void restoreMana(int amount) {
        System.out.println("🌟 " + name + " → Staff recharged +" + amount);
    }

    @Override public void fly(double height) {
        System.out.println("🦅 " + name + " → Soaring on eagle at " + height + "m");
    }

    @Override
    public SpellCaster getApprentice() {
        return new Gandalf("🧝 Radagast", mana - 2500, wisdom - 15, "Wizard");
    }

    @Override public int compareTo(Gandalf other) {
        return Integer.compare(mana, other.mana);
    }

    @Override
    public String getGuidRank() {
        return "";
    }
}