import java.util.Random;

public class PixelManipulation {

    public static void main(String[] args) {

        int[][] pixels = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < pixels.length; i++) {
            for(int j = 0; j < pixels[i].length; j++){
                pixels[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Original Pixels:");
        printPixels(pixels);

        for (int i = 0; i < pixels.length; i++) {
            for(int j = 0; j < pixels.length; j++) {
                pixels[i][j] = 255 - pixels[i][j];
            }
        }

        System.out.println("Original Pixels:");
        printPixels(pixels);

    }

    private  static  void printPixels(int[][] pixels) {
        for(int[] row : pixels) {
            for (int pixel : row) {
                System.out.printf("%4d", pixel);
            }
            System.out.println();
        }
    }
}
