package FantasyDragon;

public enum DragonType {

    FIRE("Burns everything"),
    ICE("Cool but deadly"),
    LIGHTNING("Blink and BOOM"),
    EMOTIONAL("Cries often");

    private final String ability;

    DragonType(String ability) {
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return ability + "(Special Dragon)"
                ;
    }
}
