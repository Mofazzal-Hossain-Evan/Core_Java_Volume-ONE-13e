package Melody_Studio;

public final class PopProducer extends Artist implements MusicProducer{
    public PopProducer(String name, String artistType) {
        super(name, artistType);
    }

    @Override
    public void produceTrack(String songName) {
        System.out.println("🎤 " + name + " producing Pop track: " + songName);
    }

    @Override
    public void mixAudio(int quality) {
        System.out.println("🎚️ Mixing audio at " + quality + "% quality");
    }

    @Override
    public void performLive() {
        System.out.println("💃 " + name + " performing live on stage!");
    }
}

