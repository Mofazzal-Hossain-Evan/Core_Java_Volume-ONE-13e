
# 🚦 Traffic Light System Project

## 📂 Package
`package sealed;`

## 🧩 Interfaces and Classes

### Sealed Interface
```java
sealed interface TrafficLight permits Red, Yellow, Green {
    TrafficLight next();
    String color();
}
```

### Final Subclasses
```java
final class Red implements TrafficLight {
    @Override
    public TrafficLight next() { return new Green(); }
    @Override
    public String color() { return "Red"; }
}

final class Green implements TrafficLight {
    @Override
    public TrafficLight next() { return new Yellow(); }
    @Override
    public String color() { return "Green"; }
}

final class Yellow implements TrafficLight {
    @Override
    public TrafficLight next() { return new Red(); }
    @Override
    public String color() { return "Yellow"; }
}
```

### Main Class
```java
public class TrafficLightTest {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new Red();

        for (int i = 0; i < 6; i++) {
            System.out.println("Current light: " + light.color());

            String action = switch (light) {
                case Red __ -> "STOP!";
                case Green __ -> "GO!";
                case Yellow __ -> "SLOW DOWN!";
            };

            System.out.println("Action: " + action);
            System.out.println("---------------------------");

            Thread.sleep(1000);
            light = light.next();
        }
    }
}
```

## 📈 Flowchart
```
          +---------+
          |   Red   |
          +---------+
               |
               v
          +---------+
          |  Green  |
          +---------+
               |
               v
          +----------+
          |  Yellow  |
          +----------+
               |
               v
          (Back to Red)
```

## 📚 Key Points

| Concept | How it's Applied |
|:--------|:-----------------|
| Sealed interface | TrafficLight only permits Red, Green, Yellow |
| Final subclasses | Red, Green, Yellow are final |
| Switch without default | No default needed in switch |
| Fixed hierarchy | Only three known states |
| Polymorphism | Each state knows how to move to next |
| Package use | All classes in the same package |

---
