package ShapeFactory;

public class ShapeFactory {

    public static Shape getShape(String type){
        if (type.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("Unknown");
        }
    }
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.getShape("circle");
        Shape s2 = ShapeFactory.getShape("square");

        s1.draw();
        s2.draw();
    }
}
