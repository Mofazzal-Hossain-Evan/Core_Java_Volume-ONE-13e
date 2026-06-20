package Music_Festival_System;

public interface Strummable extends Playable{
    double MAX_CHORD = 20.0;
    void strum(String chord);
}

