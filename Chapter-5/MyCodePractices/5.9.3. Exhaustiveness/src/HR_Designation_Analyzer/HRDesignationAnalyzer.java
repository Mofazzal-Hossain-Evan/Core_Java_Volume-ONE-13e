package HR_Designation_Analyzer;

public class HRDesignationAnalyzer {
public static String analyze(Employee emp){
    return switch (emp){
        case Executive e when e.title().length() > 15 ->
                "🎯 Executive with long title: "    + e.title();

        case Executive e ->  "‍💼 Executive with normal title: " + e.title();

        case Intern i ->
                "🎓 Intern from: " + i.university();
    };


}

    public static void main(String[] args) {
        Employee emp1 = new Executive("Chief Visionary Officer");
        Employee emp2 = new Executive("VP");
        Employee emp3 = new Intern("MIT");

        System.out.println(analyze(emp1));
        System.out.println(analyze(emp2));
        System.out.println(analyze(emp3));
    }

}
