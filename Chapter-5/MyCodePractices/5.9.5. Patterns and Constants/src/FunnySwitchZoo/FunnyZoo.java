package FunnySwitchZoo;

import java.time.DayOfWeek;

public class FunnyZoo {
    public static void main(String[] args) {
        Object[] zooVisitors = {
                new Lion("Leo", 5),
                new Parrot("Plly", ""),
                new Parrot("Mithu", "Hello!"),
                DayOfWeek.FRIDAY,
                "",
                0,
                null
        };

        for(Object creatures : zooVisitors){
            String reaction = switch (creatures){

                //Record pattern with guard
                case Lion l when l.age() > 3 -> "🦁 Big lion named " + l.name();
                case Lion l -> "🦁 Baby lion named " + l.name();

                // ✅ Record pattern + String guard
                case Parrot p when p.words().isEmpty() -> "🦜 A silent parrot named " + p.name();
                case Parrot p -> "🦜 Talking parrot " + p.name() + " says: " + p.words();

                // ✅ Enum constant match
                case DayOfWeek.FRIDAY -> "🎉 It's Zoo Friday Fiesta!";

                //✅ Constant pattern with guard
                case String s when s.isEmpty() -> "📭 An empty string came in?!";
                case Integer i when i == 0 -> "🕳️ A zero sneaked into the zoo.";

                // ✅ null check
                case null -> "😵 Someone forgot to bring a creature!";

                // 🔴 INVALID CASES (will not compile)
                /*
                case 0 -> "🕳️ Zero found"; // ❌ because selector = Object
                case "" -> "📭 Empty string"; // ❌ same reason
                */

                default -> "🧐 Unknown zoo visitor: " + creatures;
            };

            System.out.println(reaction);
            }
        }

}
