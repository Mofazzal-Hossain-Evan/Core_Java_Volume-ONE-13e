package ShapeDrawingSystem;

public class Triangle extends Shape{
    private double base, height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a " + color + " Triangle with base: " + base + " and height: " + height);
    }
}
