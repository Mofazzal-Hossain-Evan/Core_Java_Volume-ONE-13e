package MedievalSiegeSimulator;

public class Castle {
    private String name;
    private int wallStrength;

    public Castle(String name, int wallStrength) {
        this.name = name;
        this.wallStrength = wallStrength;
    }

    public String getName() {
        return name;
    }

    public int getWallStrength() {
        return wallStrength;
    }

    public void takeDamage(int damage){
        wallStrength -= damage;
        System.out.println(name + " takes " + damage + " damage. Wall strength now: " + wallStrength);
    }

    public boolean isDestroyed(){
        return wallStrength <= 0;
    }
}
