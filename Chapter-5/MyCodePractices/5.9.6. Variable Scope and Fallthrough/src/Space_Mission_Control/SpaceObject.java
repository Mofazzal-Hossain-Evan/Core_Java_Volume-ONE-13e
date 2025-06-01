package Space_Mission_Control;

sealed interface SpaceObject permits Satellite, SpaceShip, Asteroid {}
