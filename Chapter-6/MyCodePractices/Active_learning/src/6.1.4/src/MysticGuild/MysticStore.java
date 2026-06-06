package MysticGuild;

public class MysticStore{
    private Mystic[] mystics;

    public MysticStore() {

        this.mystics = new Mystic[]{new Merlin("🧙 Merlin", 9500, 120, "Archmage"),
                new Gandalf("🔮 Gandalf", 9200, 110, "Wizard"),
                new Hermione("📖 Hermione", 8500, 95, "Prodigy"),
                new Morgana("🌑 Morgana", 8800, 100, "Sorceress"),
                new Merlin("🧝 Young Merlin", 4500, 70, "Apprentice")};
    }

    public Mystic[] getMystics() {
        return mystics;
    }
}
