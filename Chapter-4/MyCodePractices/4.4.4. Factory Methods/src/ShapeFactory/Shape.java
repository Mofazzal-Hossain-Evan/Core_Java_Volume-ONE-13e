package ShapeFactory;

interface Shape{
    void draw();
}
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle!");
    }
}

    class Square implements Shape{
        public void draw(){
            System.out.println("Draw a square!");
        }
    }

    class Rectangle implements Shape {
        public void draw(){
            System.out.println("Draw the Rec..");
        }
    }

