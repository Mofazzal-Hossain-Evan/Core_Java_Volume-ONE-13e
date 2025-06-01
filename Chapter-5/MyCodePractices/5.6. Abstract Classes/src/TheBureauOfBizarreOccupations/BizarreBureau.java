package TheBureauOfBizarreOccupations;

public class BizarreBureau {
    public static void main(String[] args) {

        Employee[] staff = {
                new GhostHunter("Vlad"),
                new TimeTraveler("Clara"),
                new SandwichConsultant("Bob"),
                new AlienAmbassador("Zorg")
        };

        for (Employee e : staff){
            System.out.println("👤 "  +e.getName());
            System.out.println( "💼 "+ e.getJobDescription());

            if (e instanceof Funny){
                System.out.println("😂 Joke: "+ ((Funny)e).tellAJoke());

                /*
                ⛳ তাহলে ((Funny)e) মানে কী?
➡️ তুমি e কে জোর করে বলছো:

“তুমি এখন Funny টাইপ, আমি তোমার funny দিকটা access করতে চাই।” 😄

এবং তখনই Java বলে:

✅ "ঠিক আছে! তুমি যেহেতু Funny interface implement করো,
আমি তোমাকে Funny হিসেবে behave করতে দিব। এখন তুমি .tellAJoke() call করতে পারো।"
                * */
            }

            if (e instanceof DangerousJob){
                System.out.println("⚠️ Safety Tip: " + ((DangerousJob)e).safetyWarning());
            }
            System.out.println("--------------------");
        }

    }
}
