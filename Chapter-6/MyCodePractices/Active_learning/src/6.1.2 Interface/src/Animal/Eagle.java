package Animal;

public class Eagle implements AdvancedFlyable{

    @Override
    public void fly(double height){
        System.out.println("Eagle flaying at "+ height+" meters");
    }
    @Override
    public double flightSped(){
        return 120.5;
    }
}
