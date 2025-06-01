package Pattern_Maze_Adventure;

public class PatternMazeAdventure {
    public static void main(String[] args) {
        Room[] maze = {
                new EmptyRoom(),
                new TrapRoom(1),
                new TreasureRoom(232),
                new MagicRoom("Invisibility"),
                new EmptyRoom(),
                new TrapRoom(20)
        };

        int playrHealth = 100;
        int goldCollected = 0;

        System.out.println("🧙 Welcome to the Pattern Maze Adventure!");


    for(int i=0; i < maze.length; i++){
        Room room = maze[i];
        System.out.printf("%n➡️ You entered room %d: ",i);
        switch (room){
            case TrapRoom(int damage) when damage > 15 -> {
                System.out.println("🔥 It's a deadly trap! You lose " + damage + " health.");
            }

            case TrapRoom(int damage) -> {
                System.out.println("⚠️ A minor trap! You lose " + damage + " health.");
                playrHealth = playrHealth - damage;
            }

            case TreasureRoom(int gold) -> {
                System.out.println("💰 You found a treasure chest with " + gold + " gold!");
                goldCollected += gold;
            }
            case EmptyRoom __ -> {
                System.out.println("Its an Empty Room");
                //fallthrough
            }

            case MagicRoom(String spell) when  spell.equals("Invisibility")-> {
                System.out.println("✨ But suddenly you find a scroll of " + spell + "!");
            }

            default -> {
                System.out.println("\n💀 You fainted! Game Over.");
                return;
            }
        }
        System.out.printf("%n🎉 Adventure Complete! Final Health: %d, Gold Collected: %d%n", playrHealth, goldCollected);

    }
}
}
