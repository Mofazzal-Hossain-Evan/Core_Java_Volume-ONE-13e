package Video_Game_Character_System;

public non-sealed interface Attackable extends CharSequence, CharacterBehavior {
    void attack(String target);
    void defend(int shield);
}
