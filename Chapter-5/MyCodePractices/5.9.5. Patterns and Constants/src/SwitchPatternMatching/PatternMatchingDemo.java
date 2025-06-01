package SwitchPatternMatching;

import java.time.DayOfWeek;

public class PatternMatchingDemo {
    public static void main(String[] args) {

        Object o1 = 0;
        Object o2 = "";
        Object o3 = DayOfWeek.FRIDAY;
        Object o4 = new Point(0, 3);


        // 1️⃣ Constant patterns with Object selector ❌
        // These will NOT compile
        /*
        switch (obj1) {
            case 0 -> System.out.println("Zero");       // ❌ Error: selector type is Object
            case "" -> System.out.println("Empty");     // ❌ Error: selector type is Object
        }
        */

        // 2️⃣ Guarded pattern matching ✅
        switch (o1) {
            case Integer i when i == 0 -> System.out.println("Zero with Guard");
            default -> System.out.println("No zero");
        }
        switch (o2) {
            case String s when s.isEmpty() -> System.out.println("Empty String");
            default -> System.out.println("Not empty String");
        }

        // 3️⃣ Enum constants with Object selector ✅
        switch (o3){
            case DayOfWeek.FRIDAY -> System.out.println("TGIF");
            default -> System.out.println("Other day");
        }

        // 4️⃣ Record pattern with constant inside ❌
        /*
        switch (obj4) {
            case Point(0, int y) -> System.out.println("X is zero"); // ❌ Not allowed
        }
        */

        // 5️⃣ Record pattern with guard ✅
        switch (o4){
            case Point(int x, int y) when x == 0 -> System.out.println("x is zero");
            default -> System.out.println("X is not zero");
        }

        // 6️⃣ Legal constant pattern when selector is Integer ✅
        Integer number = 0;
        switch (number) {
            case 0 -> System.out.println("Exact zero match");
            default -> System.out.println("Other number");
        }
        // 7️⃣ Illegal constant pattern with Object selector ❌
 /*
Object o5 = 0;
        switch (o5) {
            case 0 -> System.out.println("Zero"); // ❌ Doesn't compile
        }

  */
    }
}
