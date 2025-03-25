package DigitalArtGenerator;

import java.util.Random;

public class PixelArt extends ArtGenerator{
    public PixelArt(int complexity) {
        super(complexity);
    }
    @Override
    public String generateArt(){
        StringBuilder art = new StringBuilder();
        Random ran = new Random();
        String[] colors = {"\u001B[31m■", "\u001B[32m■", "\u001B[34m■", "\u001B[33m■", "\u001B[35m■", "\u001B[36m■"};
   art.append("🎨 Pixel Art:\n");
   for (int i = 0; i < complexity; i++) {
       for (int j = 0; j < complexity; j++) {
           art.append(colors[ran.nextInt(colors.length)]).append(" \u001B[0m");
       }
       art.append("\n");
       try{Thread.sleep(200);} catch (InterruptedException ignored) {}
   }
return art.toString();
    }
}
