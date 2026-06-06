package MysticGuild;

public interface Elemental extends SpellCaster {

    double MAX_ELEMENT_POWER = 9000.0;

    void summonElement(String element, double power);
}