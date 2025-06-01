package GameCommandParser;

public class GameCommandParser {
    public static void parseCommand(String... tokens){
        if (tokens.length == 0) return;
        String command = tokens[0];
        System.out.println("Command" + command);
        System.out.println("Arguments:");

        for (int i = 1; i < tokens.length; i++){
            System.out.println(" - " + tokens[i] );
        }
    }
}
