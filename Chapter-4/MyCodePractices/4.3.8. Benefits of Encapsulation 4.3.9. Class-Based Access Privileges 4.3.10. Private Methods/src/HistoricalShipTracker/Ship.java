package HistoricalShipTracker;

import java.util.ArrayList;

public class Ship {
    private String name;
    private String captin;
    private int yearBuilt;
    private ArrayList<String> voyages;

    public Ship(String name, String captin, int yearBuilt) {
        this.name = name;
        this.captin = captin;
        this.yearBuilt = yearBuilt;
        this.voyages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addVoyage(String destination){
        voyages.add(destination);
    }

    public ArrayList<String> getVoyages() {
        return new ArrayList<>(voyages);
    }
}

