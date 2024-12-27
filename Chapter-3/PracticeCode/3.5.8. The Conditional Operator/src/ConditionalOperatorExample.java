public class ConditionalOperatorExample {

    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        int smaller = (x<y) ? x : y;

        System.out.println("Smaller value is: " + smaller);
    }
}
