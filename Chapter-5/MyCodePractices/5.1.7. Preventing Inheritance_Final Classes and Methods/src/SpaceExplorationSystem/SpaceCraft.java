package SpaceExplorationSystem;

public class SpaceCraft {
    private String name;
    private double speed;

    public SpaceCraft(String name, double speed) {
        this.name = name;
        this.speed = speed;

        System.out.println("Launching: " + getDetails());// ⚠️ বিপজ্জনক কল
    }

    public String getDetails(){
        return "Spaceship: " + name + " | Speed: " + speed + " km/s";
    }

}
