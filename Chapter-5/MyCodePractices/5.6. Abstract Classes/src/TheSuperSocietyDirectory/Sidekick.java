package TheSuperSocietyDirectory;

 class Sidekick extends Person implements Funny{
    private String jokeStyle;

    public Sidekick(String name, String jokeStyle) {
        super(name);
        this.jokeStyle = jokeStyle;
    }
    public String getDescription(){
        return "a sidekick who tells " + jokeStyle + " jokes";
    }

    public String tellAJoke(){
        return "Why did the hero cross the road? To punch a villain, duh!";
    }
}
