package SpaceExplorationSystem;

public class MarsRover extends SpaceCraft{
    private boolean hasAI;

    public MarsRover(String name, double speed, boolean hasAI) {
        super(name, speed); // ⚠️ এখানে getDetails() কল হবে, কিন্তু hasAI তখনও initialize হয়নি
        this.hasAI = hasAI;
    }

    @Override
    public String getDetails(){
        return "Mars Rover: " + (hasAI ? "AI-Powered" : "Manual");
    }
}
