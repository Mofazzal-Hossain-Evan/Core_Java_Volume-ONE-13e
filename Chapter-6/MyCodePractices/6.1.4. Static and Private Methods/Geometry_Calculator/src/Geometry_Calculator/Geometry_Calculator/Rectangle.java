package Geometry_Calculator;

public class Rectangle implements ShapeCalculator {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("Width and height cannot be negative");

        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return ShapeCalculator.rectangleArea(width, height);
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
