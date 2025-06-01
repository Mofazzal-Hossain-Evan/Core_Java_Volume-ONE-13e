package Traffic_Light;

final class Green implements TrafficLight {

    public TrafficLight next(){
        return new Yellow();
        //[Yellow] --(next())--> [Red] "আমি বর্তমান Yellow লাইট থেকে পরবর্তী Red লাইটে যাবো,
        // তাই next() কল করলে একটা নতুন Red অবজেক্ট বানিয়ে রিটার্ন করবো।"
    }

    @Override
    public String color() {
        return "Green";
    }
}
