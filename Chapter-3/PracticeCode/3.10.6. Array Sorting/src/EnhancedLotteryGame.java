import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class EnhancedLotteryGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // Step 1: Get user inputs for lottery setup
            System.out.print("Enter the number of lottery numbers to draw (k): ");
            int k = input.nextInt();

            System.out.print("Enter the highest number you can draw (n): ");
            int n = input.nextInt();

            if (k > n) {
                System.out.println("Error: 'k' cannot be greater than 'n'.");
                return;
            }
            // Step 2: Allow users to exclude numbers
            System.out.print("Do you want to exclude any numbers? (yes/no): ");
            String excludeResponce = input.next().toLowerCase(Locale.ROOT);
            Set<Integer> excludeNumber = new HashSet<>();

            if (excludeResponce.equals("yes")) {
                System.out.print("Enter the numbers to exclude, separated by spaces: ");
                input.nextLine(); //consume new line

                String[] exclusions = input.nextLine().split(" ");
                for (String exclusion : exclusions) {
                    excludeNumber.add(Integer.parseInt(exclusion));
                }
            }

            // Step 3: Fill the array with numbers 1 to n, excluding specified numbers
            List<Integer> availableNumber = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (!excludeNumber.contains(i)) {
                    availableNumber.add(i);
                }
            }

            if (k > availableNumber.size()) {
                System.out.println("Error: Not enough numbers available after exclusions.");
                return;
            }
            // Step 4: Draw k random numbers
            int[] result = new int[k];
            Random random = new Random();

            for (int i = 0; i < k; i++) {
                int index = random.nextInt(availableNumber.size());
                result[i] = availableNumber.get(index);
                availableNumber.remove(index);
            }

            // step 5
            Arrays.sort(result);
            System.out.println("Your lottery numbers are:");
            for (int num : result) {
                System.out.println(num);
            }

// step 6
            System.out.print("Do you want to save this combination to a file? (yes/no): ");
            String saveResponse = input.next().toLowerCase();

            if (saveResponse.equals("yes")) {
                System.out.print("Enter the file name to save the combination: ");
                String fileName = input.next();

                try (PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, true))) {
                    writer.println("Lottery Combination: " + Arrays.toString(result));
                    System.out.println("Combination saved to " + fileName);
                } catch (IOException e) {
                    System.out.println("Error saving to file: " + e.getMessage());
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            input.close();

        }

    }
}
