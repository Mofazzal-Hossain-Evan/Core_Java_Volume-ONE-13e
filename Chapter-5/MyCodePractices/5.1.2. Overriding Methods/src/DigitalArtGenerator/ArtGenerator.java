package DigitalArtGenerator;

import java.io.FileWriter;
import java.io.IOException;

abstract class ArtGenerator {
    protected int complexity;

    public ArtGenerator(int complexity) {
        this.complexity = complexity;
    }

    public abstract String generateArt();

    public void saveArtToFile(String art, String filename){
        try(FileWriter writer = new FileWriter(filename)) {
            writer.write(art);
            System.out.println("\n✅ Art saved to " + filename);
        } catch (IOException e){
            System.out.println("❌ Error saving file: " + e.getMessage());
        }
    }
}
/**
 ✅ এই ক্লাসটি Abstract Class, যার ফলে এটি ডিরেক্টলি ইনস্ট্যান্সিয়েট করা যাবে না।
 ✅ generateArt() মেথডটি abstract, তাই সব সাবক্লাসকে এটি ওভাররাইড করতে হবে।
 ✅ saveArtToFile() মেথড দিয়ে আর্টকে .txt ফাইলে সংরক্ষণ করা যাবে।
 */