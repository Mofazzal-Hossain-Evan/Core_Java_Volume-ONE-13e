/* Package declaration to match directory structure */
package Superhero_Team_Builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights deep cloning to maintain independence between originals and clones, useful for simulating Spring Boot entity management where modifications shouldn't affect shared state (Horstmann, p. 271). */

/* Class containing main method for testing Superhero cloning */
public class SuperheroTeamBuilder {
    public static void main(String[] args) throws CloneNotSupportedException {
        /* Create original superhero */
        List<String> abilities = new ArrayList<>(Arrays.asList("Super Strength", "Code Debugging Beam"));
        Superhero original = new Superhero("Captain Bugfix", 85.5, abilities);

        /* Clone the superhero */
        Superhero clone = original.clone();

        /* Modify the clone */
        clone.setPowerLevel(90.0);
        clone.getAbilities().add("Flight");

        /* Print both to confirm independence */
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
        System.out.println();

        /* Simulate Spring Boot service with a team */
        Superhero[] team = new Superhero[2];
        team[0] = original;
        team[1] = new Superhero("Doctor Debug", 78.0, new ArrayList<>(Arrays.asList("Error Detection", "Loop Unwinder")));

        /* Clone members for a new mission */
        Superhero[] missionTeam = new Superhero[team.length];
        for (int i = 0; i < team.length; i++) {
            missionTeam[i] = team[i].clone();
        }

        /* Modify clones for the mission */
        missionTeam[0].setPowerLevel(95.0);
        missionTeam[0].getAbilities().add("Quantum Leap");
        missionTeam[1].getAbilities().add("Syntax Shield");

        /* Print original team and mission team */
        System.out.println("Original Team:");
        for (Superhero hero : team) {
            System.out.println(hero);
        }
        System.out.println();

        System.out.println("Mission Team (Clones):");
        for (Superhero hero : missionTeam) {
            System.out.println(hero);
        }
    }
}