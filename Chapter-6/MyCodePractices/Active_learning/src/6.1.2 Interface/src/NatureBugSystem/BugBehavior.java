package NatureBugSystem;

public sealed interface BugBehavior permits Livable, Bug {
    String getHabitat();
}
