package TheSuperSocietyDirectory;

 class Villain extends Person implements Dangerous{
    private int chaosLevel;

    public Villain(String name, int chaosLevel) {
        super(name);
        this.chaosLevel = chaosLevel;
    }

    public String getDescription(){
        return "a villain with chaos level " + chaosLevel;
    }

    public String getWarning(){
        return "⚠️ Do not approach without pizza or backup.";
    }
}
