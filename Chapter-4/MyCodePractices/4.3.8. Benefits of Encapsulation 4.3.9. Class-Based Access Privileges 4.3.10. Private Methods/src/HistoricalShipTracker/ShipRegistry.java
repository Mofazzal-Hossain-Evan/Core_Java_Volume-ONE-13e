package HistoricalShipTracker;

import java.util.ArrayList;

public class ShipRegistry {
    private ArrayList<Ship> ships = new ArrayList<>();
    public  void registerShip(Ship ship){
        ships.add(ship);
    }

    public void showShips(){
        for (Ship ship : ships) {
            System.out.println(ship.getName() + " " + ship.getVoyages() + ")");
        }
    }
}
