package NavalBattleSimulator;

public class NavalBattle {
    public static void main(String[] args) {
        Ship ship1 = new Ship("Black Pearl", 50, 40);
        Ship ship2 = new Ship("Royal Navy", 45, 45);
        System.out.println(ship1.getName() + "vs" + ship2.getName());

        if (ship1.attact(ship2)) {
            System.out.println(ship1.getName() +"Wines");
        } else {
            System.out.println(ship2.getName() +"Wines");
        }


    }
}
