package Traffic_Light;

public class TrafficLightTest {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new Red();// start with red


        for (int i = 0; i < 6; i++) {
            System.out.println("Current Light: " + light.color());


            String action = switch (light) {
                case Red __ -> "STOP!";
                case Green __ -> "GO!";
                case Yellow __ -> "SLOW DOWN!";
            };

            System.out.println("Action: " + action);
            System.out.println("---------------------------");

            Thread.sleep(1000);
            light = light.next();
        }
    }
}
