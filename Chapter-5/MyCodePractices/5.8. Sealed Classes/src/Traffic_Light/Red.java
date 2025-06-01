package Traffic_Light;

final class Red implements TrafficLight {
    public TrafficLight next(){
        return new Green();
    }

    public String color(){
        return "Red";
    }
}
