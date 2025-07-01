package Galactic_Spaceship;

import java.util.Objects;

class Spaceship implements Comparable<Spaceship>{

    private String shipName;
    private double fuelEfficiency;
    private int cargoCapacity;

    private String missionType;

    public Spaceship(String shipName, double fuelEfficiency, int cargoCapacity, String missionType) {
        this.shipName = shipName;
        this.fuelEfficiency = fuelEfficiency;
        this.cargoCapacity = cargoCapacity;
        this.missionType = missionType;
    }

    public String getShipName() {
        return shipName;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public String getMissionType() {
        return missionType;
    }
    @Override
    public int compareTo(Spaceship other){
        int fuelCompare = Double.compare(other.fuelEfficiency, this.fuelEfficiency);
        if (fuelCompare == 0){
            return  this.shipName.compareToIgnoreCase(other.shipName);
        }
        return fuelCompare;
    }
    @Override
    public String toString() {
        return "Ship: " + shipName +
                ", Fuel Efficiency: " + fuelEfficiency + " km/L" +
                ", Cargo: " + cargoCapacity + " tons" +
                ", Mission: " + missionType;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Spaceship)) return false;
        Spaceship that = (Spaceship) o;
        return Double.compare(that.fuelEfficiency, fuelEfficiency) == 0 &&
                cargoCapacity == that.cargoCapacity &&
                shipName.equalsIgnoreCase(that.shipName);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(shipName.toLowerCase());
    }
}