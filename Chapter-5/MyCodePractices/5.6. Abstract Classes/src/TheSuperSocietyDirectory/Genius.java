package TheSuperSocietyDirectory;

 class Scientist extends Person implements Genius{
    private String field;

    public Scientist(String name, String field) {
        super(name);
        this.field = field;
    }

    public String getDescription(){
        return "a genius in " + field;
    }

    public String makeInvention(){
        return "🧪 Invented self-warming socks.";
    }
}
