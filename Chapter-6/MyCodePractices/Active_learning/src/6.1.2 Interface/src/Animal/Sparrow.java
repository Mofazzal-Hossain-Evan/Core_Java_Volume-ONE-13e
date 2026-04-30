package Animal;

public final class Sparrow implements SpeedFlyable, BirdType{

    @Override
    public void fly(double height){
        if(height > MAX_ALTITUDE){
            System.out.println("Too high for Sparrow");
        } else {
            System.out.println("Sparrow flaying at "+ height);
        }
    }

    @Override
    public double speed(){
        return MAX_SPEED;
    }
}
