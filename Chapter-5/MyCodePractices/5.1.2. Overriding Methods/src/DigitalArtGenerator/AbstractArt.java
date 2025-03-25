package DigitalArtGenerator;

import java.util.Random;

class AbstractArt extends ArtGenerator {
    public AbstractArt(int complexity) {
        super(complexity);
    }

    @Override
    public String generateArt() {
        StringBuilder art = new StringBuilder();
        Random rand = new Random();
        String[] shapes = {"○", "◇", "△", "■", "¤"};
        String[] colors = {"\u001B[31m", "\u001B[32m", "\u001B[34m", "\u001B[33m", "\u001B[35m", "\u001B[36m"};

        art.append("🎭 Abstract Art:\n");
        for (int i = 0; i < complexity; i++) {
            for (int j = 0; j < complexity; j++) {
                art.append(colors[rand.nextInt(colors.length)])
                        .append(shapes[rand.nextInt(shapes.length)])
                        .append(" \u001B[0m"); // Reset color
            }
            art.append("\n");
            try { Thread.sleep(200); } catch (InterruptedException ignored) {}
        }
        return art.toString();
    }
}
