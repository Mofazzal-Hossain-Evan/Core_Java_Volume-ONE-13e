package Video_Game_Character;

sealed interface GameCharacter permits Warrior, Mage,Archer, Assassin {

    String getAbility();
}
