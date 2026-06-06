package MysticGuild;


public abstract non-sealed class Mystic implements MysticBehavior{

    protected String name;
    protected int mana;
    protected int wisdom;
    protected String guildRank;

    public Mystic(String name, int mana, int wisdom, String guildRank) {
        this.name = name;
        this.mana = mana;
        this.wisdom = wisdom;
        this.guildRank = guildRank;
    }

    public String getName() {
        return name;
    }

    public int getMana() {
        return mana;
    }

    public int getWisdom() {
        return wisdom;
    }

    public String getGuildRank() {
        return guildRank;
    }


    public String guildRank(){
        return guildRank;
    }


    public abstract  String getMysticType();

    @Override
    public String toString() {
        return getMysticType() +
                " [" + name +
                " ✨Mana:" + mana +
                " 🧠Wis:" + wisdom + "]";
    }
}