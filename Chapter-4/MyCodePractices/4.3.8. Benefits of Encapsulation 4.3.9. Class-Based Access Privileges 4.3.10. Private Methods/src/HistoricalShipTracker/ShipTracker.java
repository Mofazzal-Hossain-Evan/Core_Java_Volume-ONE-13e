package HistoricalShipTracker;

public class ShipTracker {
    public static void main(String[] args) {
        Ship mayflower = new Ship("Mayflower", "Christopher Jones", 1620);
        mayflower.addVoyage("Plymouth Colony");

        Ship beagle = new Ship("HMS Beagle", "Robert FitzRoy", 1820);
        beagle.addVoyage("Galápagos Islands");

        ShipRegistry registry = new ShipRegistry();
        registry.registerShip(mayflower);
        registry.registerShip(beagle);

        registry.showShips();
    }
}
