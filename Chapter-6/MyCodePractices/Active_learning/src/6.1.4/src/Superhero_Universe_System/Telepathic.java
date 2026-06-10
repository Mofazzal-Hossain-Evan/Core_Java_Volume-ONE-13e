package Superhero_Universe_System;

public interface Telepathic extends Powered{
    double MAX_RANGE = 500.0;
    void readMind(String target);
    void controlMind(String target);
}
