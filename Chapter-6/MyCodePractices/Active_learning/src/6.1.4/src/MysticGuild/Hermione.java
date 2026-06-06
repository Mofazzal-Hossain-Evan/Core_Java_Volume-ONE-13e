package MysticGuild;

public final class Hermione extends Mystic
        implements Telepathic, Comparable<Hermione> {

    public Hermione(String name, int mana, int wisdom, String guildRank) {
        super(name, mana, wisdom, guildRank);
    }

    @Override
    public String getMysticType() {
        return "📖 Hermione";
    }

    @Override
    public void castSpell(String target) {
        System.out.println("📚 " + name + " → Wingardium Leviosa on " + target + "!");
    }

    @Override
    public void restoreMana(int amount) {
        System.out.println("🧠 " + name + " → Knowledge restored +" + amount);
    }

    @Override
    public void readMind(String target) {
        System.out.println("🔍 " + name + " → Reading " + target + "'s thoughts 💭");
    }

    @Override
    public void controlMind(String target) {
        System.out.println("🎯 " + name + " → Confundus on " + target + "!");
    }

    @Override
    public SpellCaster getApprentice() {
        return new Hermione("📖 Young Witch", mana - 1800, wisdom, "Student");
    }

    @Override
    public int compareTo(Hermione other) {
        return Integer.compare(mana, other.mana);
    }

    @Override
    public String getGuidRank() {
        return "";
    }
}