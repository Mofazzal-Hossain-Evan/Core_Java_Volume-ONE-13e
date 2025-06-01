package ShapeDrawingSystem;

public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a " + color + " Rectangle with width: " + width + " and height: " + height);
    }
}
