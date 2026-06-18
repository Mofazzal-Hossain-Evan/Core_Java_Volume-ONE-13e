package Melody_Studio;


public abstract non-sealed class Artist implements MusicBehavior{
    protected String name;
    protected String artistType;

    public Artist(String name, String artistType) {
        this.name = name;
        this.artistType = artistType;
    }



    public String getName() {
        return name;
    }

    @Override
    public String getArtistType() {
        return artistType;
    }

    public void performLive() {
    }
}
