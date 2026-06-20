package Music_Festival_System;



public sealed interface MusicBehavior permits Playable, Musician{
    String getGenre();
}
