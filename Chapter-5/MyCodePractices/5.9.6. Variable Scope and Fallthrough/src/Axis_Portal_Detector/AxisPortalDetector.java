package Axis_Portal_Detector;

public class AxisPortalDetector {
    public static void main(String[] args) {

        Portal[] portals = {
                new Portal("North Gate", 0, 0),
                new Portal("East Wind", 1, 0),
                new Portal("South Depths", 0, 1),
                new Portal("Mystic Void", 1, 1),
                new Portal("X Shadow", 0, -2),
                new Portal("Y Blaze", -3, 0)
        };

        System.out.println("🌀 Axis Portal Detector Initialized\n");

        for (Portal p : portals){
            System.out.printf("\uD83D\uDD0D Scanning portal: %s at (%.1f, %.1f)%n", p.name(), p.x(), p.y());
            String  location = switch (p) {
                case Portal(String name, double x, double y) when x == 0 && y == 0 ->
                        "📍 " + name + " is at the Origin!";
                case Portal(String name, double x, _) when x == 0 ->
                        "🧭 " + name + " lies along the Y-axis.";
                case Portal(String name, _, double y) when y == 0 ->
                        "🧭 " + name + " lies along the X-axis.";
                case Portal(String name, _, _) -> "❓ " + name + " is not aligned with any axis.";

            };
            System.out.println(location + "\n");
        }
    }
}
