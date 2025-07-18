package GeometryCalculator;

public class LineSegment {

    private Point start;
    private Point end;

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double length(){
        return start.distanceTo(end);
    }
}
