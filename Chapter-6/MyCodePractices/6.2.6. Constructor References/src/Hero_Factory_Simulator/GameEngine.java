package Hero_Factory_Simulator;

import java.util.*;
import java.util.stream.Collectors;

public class GameEngine {

    private GameWorld gameWorld = new GameWorld();

    public void spawnEnemies(List<String> enemyNames) {
        List<Hero> enemies = enemyNames.stream()
                .map(Hero::new)
                .sorted(Comparator.comparing(Hero::getPowerLevel))
                .collect(Collectors.toList());

        enemies.forEach(enemy -> {
            gameWorld.addEnemy(enemy);
            System.out.println("Spawned: " + enemy);
        });
    }

    public static void main(String[] args) {
        GameEngine game = new GameEngine();

        List<String> wave1 = Arrays.asList(
                "Goblin", "Orc", "Troll", "Dragon"
        );

        game.spawnEnemies(wave1);
    }

    private class GameWorld {
        public void addEnemy(Hero enemy) {
        }
    }
}
