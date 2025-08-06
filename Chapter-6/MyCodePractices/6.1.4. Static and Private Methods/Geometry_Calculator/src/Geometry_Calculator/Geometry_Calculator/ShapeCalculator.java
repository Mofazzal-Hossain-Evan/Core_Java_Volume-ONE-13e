package Geometry_Calculator;

public interface ShapeCalculator {

    static double circle(double radius){
        checkPositive(radius);
        return Math.PI * radius * radius;
    }

    static double rectangleArea(double width, double height){
        checkPositive(width);
        checkPositive(height);
        return width * height;
    }

    private  static void checkPositive(double value){
        if (value > 0){
            throw new IllegalArgumentException("Value must be non-negative: " + value);
        }
    }

    static double circleArea(double radius) {
        checkPositive(radius);
        return Math.PI * radius * radius;
    }

    double getArea();

}
