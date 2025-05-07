
# 🎭 ShapeJudge: Pattern Matching + Guards in Java

## 🔰 প্রজেক্টের বিবরণ:
এই প্রজেক্টে আমরা Java-এর `sealed interface`, `record`, এবং `pattern matching` + `when` guard ব্যবহার করে বিভিন্ন `Shape` এর ধরন যাচাই করছি।

## ✅ ব্যবহৃত ক্লাসগুলো:
```java
sealed interface Shape permits Circle, Rectangle, Triangle {}

record Circle(int radius) implements Shape {}
record Rectangle(int length, int width) implements Shape {}
record Triangle(int a, int b, int c) implements Shape {}
```

## 🧪 প্রধান কোড:
```java
public class ShapeJudge {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(10),
            new Circle(0),
            new Rectangle(5, 5),
            new Rectangle(10, 20),
            new Triangle(3, 4, 5),
            new Triangle(1, 1, 10) // invalid
        };

        for (Shape s : shapes) {
            String verdict = switch (s) {
                case Circle c when c.radius() <= 0 -> "❌ Invalid Circle";
                case Circle c -> "🟢 Circle with radius " + c.radius();
                case Rectangle r when r.length() == r.width() -> "🟥 Square";
                case Rectangle r -> "⬛ Rectangle " + r.length() + "x" + r.width();
                case Triangle t when isValidTriangle(t) -> "🔺 Valid Triangle";
                case Triangle t -> "❌ Invalid Triangle";
            };
            System.out.println(s + " → " + verdict);
        }
    }

    private static boolean isValidTriangle(Triangle t) {
        int a = t.a(), b = t.b(), c = t.c();
        return a + b > c && a + c > b && b + c > a;
    }
}
```

## 💡 শেখার পয়েন্ট:
- `record` নিজেই **getter-like method** তৈরি করে: যেমন `radius()`, `length()`, `a()` ইত্যাদি।
- `sealed interface` ব্যবহার করে shape ধরন নির্দিষ্ট করা হয়।
- `switch`-এর ভিতরে `when` guard ব্যবহার করে condition চেক করা যায়।
- মজারভাবে বিভিন্ন shape এর ধরন নির্ণয় করা যায় pattern matching দিয়ে।

## 📌 Extra:
Guard না match করলে পরবর্তী case এ চলে যায়।

Example:
```java
case Circle c when c.radius() <= 0 -> "Invalid";
case Circle c -> "Valid Circle";
```
