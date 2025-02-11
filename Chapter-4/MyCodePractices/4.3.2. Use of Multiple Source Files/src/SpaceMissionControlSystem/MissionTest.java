package SpaceMissionControlSystem;

public class MissionTest {
    public static void main(String[] args) {
        Astronaut a1 = new Astronaut("Alice", "Commander");
        Astronaut a2 = new Astronaut("Bob", "Engineer");

        MissionControl.assignMission(a1, "Mars Exploration");
        MissionControl.assignMission(a2, "Lunar Research");

        Spaceship ship = new Spaceship("Orio", 60);

        ship.addAstronaut(a1);
        ship.addAstronaut(a2);

        ship.displayDetails();
        ship.launch();
    }


}
