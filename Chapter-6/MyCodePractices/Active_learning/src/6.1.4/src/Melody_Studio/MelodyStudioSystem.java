package Melody_Studio;

public class MelodyStudioSystem {

    public static void main(String[] args) {

        System.out.println("🎵 Welcome to Melody Studio!\n");

        // 1. Static Methods
        System.out.println("=== 1. Static Methods ===");
        System.out.println(MusicProducer.getGenreTier("pop"));
        System.out.println(MusicProducer.getGenreTier("rock"));
        System.out.println("Hit Potential? " + MusicProducer.isHitPotential(2500000));

        MusicProducer newProducer = MusicProducer.createProducer("lofi");
        System.out.println("New Producer Created: " + newProducer.getArtistType());

        System.out.println();

        // 2. Default Methods + Private Method (DRY)
        System.out.println("=== 2. Default & Private Methods ===");
        PopProducer taylor = new PopProducer("Taylor Swift", "Pop");

        taylor.applyAutoTune(85);
        taylor.applyAutoTune(65);
        System.out.println(taylor.getProductionReport(90));
        System.out.println(taylor.getProductionReport(70));

        System.out.println();

        // 3. Interface as Reference
        System.out.println("=== 3. Using Interface Reference ===");
        MusicProducer producer1 = MusicProducer.createProducer("pop");
        MusicProducer producer2 = MusicProducer.createProducer("rock");

        producer1.produceTrack("Blank Space");
        producer2.produceTrack("Highway to Hell");

        System.out.println("\n🎉 Default & Static Methods শেষ! 🎵");
    }
}