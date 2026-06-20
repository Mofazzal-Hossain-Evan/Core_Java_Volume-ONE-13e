package Music_Festival_System;

public interface Beatable extends Playable{
    double MAX_BPM = 200.0;
    void beat(int bpm);
}

