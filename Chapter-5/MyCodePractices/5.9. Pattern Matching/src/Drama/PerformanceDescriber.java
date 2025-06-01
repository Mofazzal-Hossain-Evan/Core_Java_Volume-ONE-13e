package Drama;

public class PerformanceDescriber {
    public static String describeWithInstanceof(Performer p){
        String result;

        if (p instanceof Comedian c)
            result = "🎭 Comedian Act: " + c.getAct() + " | Catchphrase: " + c.getCatchphrase();
        else if (p instanceof TragicActor t)
            result = "🎭 Tragic Act: " + t.getAct() + " | Monologue: " + t.getMonologue();
        else if (p instanceof ActionHero a)
            result = "🎭 Action Act: " + a.getAct() + " | Move: " + a.getStuntMove();
        else if (p instanceof Amateur am)
            result = "🎭 Amateur: " + am.getAct() + " | Excuse: " + am.getExcuse();
else
            result = "🎭 Unknown performer silently exits the stage...";
return result;
    }

    public static String describeWithSwitch(Performer p){
        return switch (p){
            case Comedian c -> "🎭 Comedian: " + c.getAct() + " | Joke: " + c.getCatchphrase();
            case TragicActor t -> "🎭 Tragedy: " + t.getAct() + " | Line: " + t.getMonologue();
            case ActionHero a -> "🎭 Action Hero: " + a.getAct() + " | Move: " + a.getStuntMove();
            case Amateur am -> "🎭 Amateur: " + am.getAct() + " | Panic: " + am.getExcuse();
            case Performer __ -> "🎭 Unknown performer silently walks off the stage.";
        };
    }
}
