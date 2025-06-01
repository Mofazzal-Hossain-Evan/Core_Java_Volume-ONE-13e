package SpaceExplorationSystem;

public class SafeSpaceCraft {

    private String name;
    private double speed;

    public SafeSpaceCraft(String name, double speed) {
        this.name = name;
        this.speed = speed;
        System.out.println("Launching: " + getSafeDetails()); // ✅ এখন নিরাপদ

    }

    public final  String getSafeDetails(){
        return "Spaceship: " + name + " | Speed: " + speed + " km/s";
    }
}
