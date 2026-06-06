package MysticGuild;

public interface Telepathic extends SpellCaster {
    double MAX_RANGE = 500.0;
    void readMind(String target);
    void controlMind(String target);

}