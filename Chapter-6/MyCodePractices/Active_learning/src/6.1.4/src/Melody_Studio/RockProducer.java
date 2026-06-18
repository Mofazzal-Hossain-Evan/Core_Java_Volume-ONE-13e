package Melody_Studio;


public final class RockProducer extends Artist implements MusicProducer {

    public RockProducer(String name, String artistType) {
        super(name, artistType);
    }

    @Override
    public void produceTrack(String songName) {
        System.out.println("🎸 " + name + " is producing Rock track: " + songName + " 🔥");
    }

    @Override
    public void mixAudio(int quality) {
        System.out.println("🎚️ " + name + " mixing rock audio with high energy at " + quality + "%");
    }

    @Override
    public void  performLive() {
        System.out.println("🤘 " + name + " rocking the stage with heavy guitar and crowd surfing!");
    }
}

