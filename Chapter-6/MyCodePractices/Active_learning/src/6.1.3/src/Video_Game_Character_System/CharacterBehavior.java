package Video_Game_Character_System;

public sealed interface CharacterBehavior permits Attackable, GameCharacter {
    String getCharacterClass();
}
