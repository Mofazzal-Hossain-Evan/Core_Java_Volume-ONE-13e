package SpaceMissionControlSystem;

public class Astronaut {

    private String name;
    private String rank;
    private String currentMission;

    public Astronaut(String name, String rank){
        this.rank = rank;
        this.name = name;
        this.currentMission = "No mission assained";
    }

    public void assignMission(String missionName){
        this.currentMission = missionName;
    }

    public String getDetails(){
        return "Astronaut: " + name + " | Rank: " + rank + " | Mission: " + currentMission;

    }
}
