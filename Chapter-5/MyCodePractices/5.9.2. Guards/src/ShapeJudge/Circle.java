package ShapeJudge;

public record Circle(int radius) implements Shape {}
record Rectangle(int length, int width) implements Shape{}
record Triangle(int a, int b, int c) implements Shape {}
