package GameCommandParser;

import static GameCommandParser.GameCommandParser.parseCommand;

public class Main {
    public static void main(String[] args) {
        parseCommand("move", "north", "3", "steps");
        parseCommand("attack", "dragon", "with", "sword");

    }
}
