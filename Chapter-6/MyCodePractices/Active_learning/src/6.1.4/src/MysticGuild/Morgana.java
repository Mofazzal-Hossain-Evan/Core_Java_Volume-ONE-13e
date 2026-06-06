package MysticGuild;

public final class Morgana extends Mystic
        implements Flyable, Telepathic, Elemental, Comparable<Morgana> {

    public Morgana(String name, int mana, int wisdom, String guildRank) {
        super(name, mana, wisdom, guildRank);
    }

    @Override public String getMysticType() { return "🌑 Morgana"; }

    @Override public void castSpell(String target) {
        System.out.println("🌑 " + name + " → Dark Phoenix spell on " + target + " 🔥");
    }

    @Override public void restoreMana(int amount) {
        System.out.println("🌙 " + name + " → Shadow mana +" + amount);
    }

    @Override public void fly(double height) {
        System.out.println("🦇 " + name + " → Levitating at " + height + "m");
    }

    @Override public void readMind(String target) {
        System.out.println("💭 " + name + " → Probing " + target + "'s mind");
    }

    @Override public void controlMind(String target) {
        System.out.println("🕴️ " + name + " → Controlling " + target);
    }

    @Override public void summonElement(String element, double power) {
        System.out.println("🌫️ " + name + " → " + element + " storm [" + power + "]");
    }

    @Override
    public SpellCaster getApprentice() {
        return new Morgana("🌑 Shadow Apprentice", mana + 3000, wisdom, "Sorceress");
    }

    @Override public int compareTo(Morgana other) {
        return Integer.compare(mana, other.mana);
    }

    @Override
    public String getGuidRank() {
        return "";
    }
}