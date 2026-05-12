package ZooSystem;

public sealed interface AnimalBehavior permits Livable {
    String getHabitat();
}
