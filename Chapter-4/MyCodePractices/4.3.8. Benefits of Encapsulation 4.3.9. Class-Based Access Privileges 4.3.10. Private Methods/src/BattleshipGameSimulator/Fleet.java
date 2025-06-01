package BattleshipGameSimulator;

import java.util.Random;

public class Fleet {
    private Ship[] ships;
    private Random random = new Random();

    public Fleet(Ship[] ships) {
        this.ships = ships;
    }

    public boolean hasSurvivingShips(){
        for (Ship ship : ships){
            if (!ship.isSunk()) return true;
        }
        return false;
    }

    public Ship getRandomAvailableShip(){
        while (true){
            Ship ship = ships[random.nextInt(ships.length)];
            if (!ship.isSunk()) return ship;
        }
    }
}
