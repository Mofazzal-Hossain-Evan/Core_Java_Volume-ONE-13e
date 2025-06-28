package The_Superhero_Showdown;

public class SpeedComparator implements Comparable<Superhero>{

    public int compare(Superhero s1, Superhero s2){
        int speedComparison = Double.compare(s1.getSpeed(), s2.getSpeed());

        return speedComparison != 0 ? speedComparison : s1.getName().compareTo(s2.getName());
    }
}
