package DigitalArtGenerator;

import java.util.Random;

class AIGeneratedArt extends ArtGenerator {
    public AIGeneratedArt(int complexity) {
        super(complexity);
    }

    @Override
    public String generateArt() {
        StringBuilder art = new StringBuilder();
        Random rand = new Random();
        String[] patterns = {"▒▒", "▓▓", "░░", "█", "▌"};
        String[] colors = {"\u001B[31m", "\u001B[32m", "\u001B[34m", "\u001B[33m", "\u001B[35m", "\u001B[36m"};

        art.append("🤖 AI-Generated Art:\n");
        for (int i = 0; i < complexity; i++) {
            for (int j = 0; j < complexity; j++) {
                art.append(colors[rand.nextInt(colors.length)])
                        .append(patterns[rand.nextInt(patterns.length)])
                        .append(" \u001B[0m");
            }
            art.append("\n");
            try { Thread.sleep(200); } catch (InterruptedException ignored) {}
        }
        return art.toString();
    }
}

