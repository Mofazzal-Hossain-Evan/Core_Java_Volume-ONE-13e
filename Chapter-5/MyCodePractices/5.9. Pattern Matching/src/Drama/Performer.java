package Drama;

public sealed class Performer permits Comedian, TragicActor, ActionHero, Amateur{
public String getName(){
    return "Unnamed Performer";
}
public String getAct(){
    return "Standing silently on stage...";
}
}
