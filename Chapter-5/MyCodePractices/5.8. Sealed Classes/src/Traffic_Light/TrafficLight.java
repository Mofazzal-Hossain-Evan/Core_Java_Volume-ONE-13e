package Traffic_Light;

// Step 1: Define the sealed interface

 sealed interface TrafficLight permits Red, Yellow, Green {
     TrafficLight next();// Each light moves to the next
     String color();  // Each light has a color name
}
