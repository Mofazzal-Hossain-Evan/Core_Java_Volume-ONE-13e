package Space_Mission_Control;

public class SpaceMissionControl {
    public static void main(String[] args) {

        SpaceObject[] objects = {

                new Satellite("SAT-A1", 350),
                new SpaceShip("Odyssey", 5),
                new Asteroid(10234.5),
                new Satellite("SAT-Z9", 2000),
                new SpaceShip("Voyager", 0),
                new Asteroid(600)
        };

        for (SpaceObject obj : objects) {

            System.out.println("🛰️ Scanning object...");

            String result = switch (obj) {
                case Satellite(String id, int orbitKM) when orbitKM < 500 ->
                        "\uD83D\uDEF0\uFE0F " + id + " is in **Low Earth Orbit**";
                case Satellite(String id, int orbitKm) -> "🛰️ " + id + " is in **High Earth Orbit**";
                case SpaceShip(String name, int crew) when crew == 0 ->
                        "🚀 " + name + " is **Unmanned** – likely an AI probe!";
                case SpaceShip(String name, int crew) -> "🚀 " + name + " is **Manned** with crew of " + crew;

                case Asteroid(double mass) when mass > 1000 -> "☄️ Massive asteroid detected! Mass: " + mass + " tons";
                case Asteroid(double mass) -> "☄️ Small asteroid floating. Mass: " + mass + " tons";
            };
            System.out.println(result + "\n");
        }
    }
}
