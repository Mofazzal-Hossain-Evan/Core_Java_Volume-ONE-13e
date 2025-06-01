package WarSimulation;

import java.util.List;

record Soldier(String name, int power){}
record Tank(int number, int firePower) {}
record AirPlane(int number, int firePower){}

record Army(List<Soldier> solders, List<Tank> tanks, List<AirPlane> airPlane) {
    public int totalPower() {
        return solders().size() * 10 + tanks.size() * 50 + airPlane.size() * 100;
    }
}

public class WarSimulation {

    public static void main(String[] args) {
        Army army1 = new Army(
                List.of(new Soldier("John", 10), new Soldier("Mike", 10)),
                List.of(new Tank(2,50)),
                List.of(new AirPlane(1,100))
        );

        Army army2 = new Army(
                List.of(new Soldier("Alex", 10), new Soldier("Steve", 10)),
                List.of(new Tank(3, 50)),
                List.of(new AirPlane(2, 100))
        );

        System.out.println("Army 1 Power: " + army1.totalPower());
        System.out.println("Army 2 Power: " + army2.totalPower());

        String winner = army1.totalPower() > army2.totalPower() ? "Army 1 Wins" : "Army 2 Wins";
        System.out.println("🏆 Result: " + winner);
    }


}
