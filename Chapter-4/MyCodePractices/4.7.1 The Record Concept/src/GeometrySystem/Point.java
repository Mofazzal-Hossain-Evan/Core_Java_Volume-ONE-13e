package GeometrySystem;

public record Point(double x, double y) {
    public  double distance(Point other){
        return Math.hypot(x - other.x, y - other.y);

        //Java-এর record ব্যবহার করলে, প্রতিটি ফিল্ডের জন্য automatic accessor methods তৈরি হয়।
    }
}

record Circle(Point center, double radius) {
    public double area(){
        return Math.PI * radius * radius;
    }

    public boolean contains(Point p){
        return center.distance(p) <= radius;
    }
}

record Rectangle(Point topLeft, double width, double height) {
    public double area() {
        return width * height;
    }

    public boolean contains(Point p){
        return p.x() >= topLeft.x() && p.x() <= (topLeft.x() + width) &&
                p.y() <= topLeft.y() && p.y() >= (topLeft.y() - height);


        //প্রতিটি অংশ নিশ্চিত করে যে p রেক্ট্যাঙ্গেলের সীমার মধ্যে আছে।
    }
}

