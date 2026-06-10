package Superhero_Universe_System;

public interface Blastable extends Powered {
    double MAX_BLAST = 9000.0;
    void blast(String target, double power);

}
