package Melody_Studio;

public  sealed interface MusicBehavior permits MusicProducer, Artist{
    String getArtistType();
}



