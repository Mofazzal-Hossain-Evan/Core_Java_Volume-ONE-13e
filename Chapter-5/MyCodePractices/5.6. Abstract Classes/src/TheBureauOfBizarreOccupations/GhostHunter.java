package TheBureauOfBizarreOccupations;

public class GhostHunter extends Employee{
    public GhostHunter(String name) {
        super(name);
    }

    public String getJobDescription(){
        return "hunts ghosts in haunted libraries, complains about cold spots.";
    }
}
