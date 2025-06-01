package Staff_Describer;

sealed interface Staff permits Teacher, Janitor, Visitor {
    String describeSelf();
}

final class Teacher implements Staff{
    private final String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    @Override
    public String describeSelf(){
        return "👩‍🏫 Teaches: " + subject;
    }
}

final class Janitor implements Staff{
    public String describeSelf(){
        return "🧹 Keeps the school clean!";

    }
}

final class Visitor implements Staff{
    private final String purpose;

    public Visitor(String purpose) {
        this.purpose = purpose;
    }

    public String describeSelf(){
        return "👤 Visitor here for: " + purpose;

    }

}

