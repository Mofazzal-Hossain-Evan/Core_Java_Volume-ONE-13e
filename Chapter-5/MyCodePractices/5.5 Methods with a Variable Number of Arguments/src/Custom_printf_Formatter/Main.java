package Custom_printf_Formatter;

public class Main {
    public static void main(String[] args) {

        MyFormatter.format("Hello, %s! Age: %d, Temp: %f°C\n", "Alice", 25, 36.6);
        MyFormatter.format("Is student: %b, Grade: %c\n", true, 'A');
        MyFormatter.format("Show percent: %%\n");
    }
}
