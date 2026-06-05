package SpaceSystem;

public sealed interface SpaceBehavior
        permits Explorable, SpaceObject {
    String getPlanetType();
}
