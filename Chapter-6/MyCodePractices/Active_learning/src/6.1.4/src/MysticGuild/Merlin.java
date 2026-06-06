package MysticGuild;

public final class Merlin extends Mystic
        implements Flyable, Elemental, Comparable<Merlin> {

    public Merlin(String name, int mana, int wisdom, String guildRank) {
        super(name, mana, wisdom, guildRank);
    }

    @Override public String getMysticType() { return "🧙 Merlin"; }

    @Override
    public void castSpell(String target) {
        System.out.println("🧙 " + name + " → Ancient spell on " + target + " ✨");
    }

    @Override
    public void restoreMana(int amount) {
        System.out.println("⚡ " + name + " → Mana restored +" + amount + " 🔋");
    }

    @Override
    public void fly(double height) {
        System.out.println("🕊️ " + name + " → Flying at " + height + "m ✨");
    }

    @Override
    public void summonElement(String element, double power) {
        System.out.println("🌋 " + name + " → Summoning " + element + " [" + power + "]");
    }

    @Override
    public SpellCaster getApprentice() {
        return new Merlin("🧝 Young Merlin", mana - 2000, wisdom - 20, "Apprentice");
    }

    @Override
    public int compareTo(Merlin other) {
        return Integer.compare(mana, other.mana);
    }

    @Override
    public String getGuidRank() {
        return "";
    }
}