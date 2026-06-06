package MysticGuild;


public interface Flyable extends SpellCaster{
    double MAX_ALTITUDE =1000.0;
    void fly(double height);

    default boolean canFlyHigh(double height){
        return checkAltitude(height) && checkBroomStamina();
    }

    private boolean checkAltitude(double height){
        return height <= MAX_ALTITUDE;
    }

    private boolean checkBroomStamina(){
        return true;
    }

}