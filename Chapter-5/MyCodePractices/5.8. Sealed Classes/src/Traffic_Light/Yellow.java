package Traffic_Light;

final class Yellow implements TrafficLight{

    @Override
    public TrafficLight next() {
        return new Red();
    }

    @Override
    public String color() {
        return "Yellow";
    }
}
