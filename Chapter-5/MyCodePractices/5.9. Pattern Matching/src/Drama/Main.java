package Drama;

public class Main {
    public static void main(String[] args) {
        Performer[] cast = {
                new Comedian(),
                new TragicActor(),
                new ActionHero(),
                new Amateur(),
               // new Performer() {} // fallback test.
                // ❌ Java-তে sealed class থেকে anonymous class তৈরি করা যায় না যদি না
                // সেই anonymous class-কে permits-এ allow করা হয়।
        };
        for (Performer p : cast){
            System.out.println("Using instanceof:");
            System.out.println(PerformanceDescriber.describeWithInstanceof(p));
            System.out.println("Using switch:");
            System.out.println(PerformanceDescriber.describeWithSwitch(p));
            System.out.println("--------------------------------------------------");
        }
    }
}
