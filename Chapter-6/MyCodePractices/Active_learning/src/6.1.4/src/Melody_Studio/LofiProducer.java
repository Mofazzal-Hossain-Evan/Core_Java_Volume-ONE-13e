package Melody_Studio;



public final class LofiProducer extends Artist implements MusicProducer {

    public LofiProducer(String name, String artistType) {
        super(name, artistType);
    }

    @Override
    public void produceTrack(String songName) {
        System.out.println("🌙 " + name + " is creating chill Lofi track: " + songName + " ☕");
    }

    @Override
    public void mixAudio(int quality) {
        System.out.println("🌫️ " + name + " mixing soft lofi beats at " + quality + "% quality");
    }

    public void performLive() {
        System.out.println("🪴 " + name + " performing live in a cozy lofi session...");
    }
}

