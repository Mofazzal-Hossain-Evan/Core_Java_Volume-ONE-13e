import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class RandomTeamGenerator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter names separated by commas:");
        String input =in.nextLine();
        String[] names = input.split(",");
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println("Enter team size: ");
        int teamSize = in.nextInt();

        if(teamSize <= 0 || teamSize > nameList.size()) {
            System.out.println("Invalid team size.");
            return;
        }

        Collections.shuffle(nameList);
        int teamCount = (int) Math.ceil((double) nameList.size() / teamSize);
        List<List<String>> teams = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            teams.add(new ArrayList<>());
        }

        for (int i=0; i < nameList.size(); i++) {
            teams.get(i % teamCount).add(nameList.get(i));
            //The modulo operator (%) ensures that items are distributed
            //  cyclically across the teams.
        }

        System.out.println("Do you want to save the teams to a file? (yes/no): ");
        String saveResponse = in.next().toLowerCase();

        if (saveResponse.equals("yes")) {
            System.out.println("Enter the file name: ");
            String fileName = in.next();
            try(PrintWriter writer = new PrintWriter(new FileOutputStream(fileName))) {
                for(int i = 0; i < teams.size(); i++) {
                    writer.println("Team " + (i + 1) + ": " + teams.get(i));
                }
                System.out.println("Enter the file name: ");
            } catch (IOException e) {
                System.out.println("Error to save the file: "+ e.getMessage());
            }
        }

    }
}
