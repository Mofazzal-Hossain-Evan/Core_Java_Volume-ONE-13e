package Video_Game_Character;

public class GameCharacterTest {

    public static void main(String[] args) {
        GameCharacter warrior = new Warrior();
        GameCharacter mage = new Mage();
        GameCharacter archer = new Archer();
        GameCharacter assassin = new Assassin();
        GameCharacter fireMage = new FireMage();
        GameCharacter iceMage = new IceMage();

        // Using a switch expression to display abilities
        System.out.println("Warrior ability: " + warrior.getAbility());
        System.out.println("Mage ability: " + mage.getAbility());
        System.out.println("Archer ability: " + archer.getAbility());
        System.out.println("Assassin ability: " + assassin.getAbility());
        System.out.println("Fire Mage ability: " + fireMage.getAbility());
        System.out.println("Ice Mage ability: " + iceMage.getAbility());
    }
}
