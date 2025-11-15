package lambda_lab;

public class Main {
    public static void main(String[] args) {
        System.out.println("🎓 Welcome to LambdaLab — Functional Interface Workshop!\n");

        ComparatorDemo.runDemo();
        System.out.println("\n-----------------------------\n");

        TimerDemo.runDemo();
        System.out.println("\n-----------------------------\n");

        PredicateDemo.runDemo();
        System.out.println("\n-----------------------------\n");

        SupplierDemo.runDemo();
        System.out.println("\n-----------------------------\n");

        FunctionTypeDemo.runDemo();
        System.out.println("\n-----------------------------\n");

        IntFunctionDemo.runDemo();
        System.out.println("\n-----------------------------\n");

        AmbiguityDemo.runDemo();
    }
}
