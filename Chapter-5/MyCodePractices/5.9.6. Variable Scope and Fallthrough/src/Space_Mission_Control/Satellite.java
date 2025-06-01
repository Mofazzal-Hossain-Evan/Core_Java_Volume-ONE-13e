package Space_Mission_Control;

public record Satellite(String id, int orbitKM) implements SpaceObject {}
record SpaceShip(String name, int crew) implements SpaceObject {}
record Asteroid(double mass) implements SpaceObject{}
