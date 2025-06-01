package University_of_Weird_Majors;

class Professor extends Person{
    private String subject;

    public Professor(String name, String subject) {
        super(name);
        this.subject = subject;
    }



    @Override
    public String getDescription() {
        return "teaches " + subject + ", often questions life's meaning while grading.";
    }
}
