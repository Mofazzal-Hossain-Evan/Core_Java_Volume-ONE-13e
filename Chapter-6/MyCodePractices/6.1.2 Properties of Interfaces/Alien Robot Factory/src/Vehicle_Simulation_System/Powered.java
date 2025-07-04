package Vehicle_Simulation_System;

sealed interface Powered extends Moveable permits Car, ElectronicScoter {
    double SPEED_LIMIT = 120.0;

    double milesPerGallon();
}
