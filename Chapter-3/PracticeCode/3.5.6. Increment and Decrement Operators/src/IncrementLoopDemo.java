public class IncrementLoopDemo {
    public static void main(String[] args) {

        int m = 3;
        int o = 5;

        System.out.println("Initial values: m = " + m + ", n = " + o);

        System.out.println("\nUsing pre-increment (++m):");
        for (int i=0; i < 3; i++ ) {
            int a = 2 * ++m;
            System.out.println("Iteration " +(i + 1) +": m = " + m + ", o = " + o);
        }

        System.out.println("\nUsing post-increment (n++):");
        for (int i = 0; i < 3;  i++) {
            int b =2 * o++;
            System.out.println("Iteration " + (i + 1) + ": 0 = " + 0 + ", o = " + b);
        }
    }
}
