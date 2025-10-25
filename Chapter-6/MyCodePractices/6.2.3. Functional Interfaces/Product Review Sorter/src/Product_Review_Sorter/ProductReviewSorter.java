/* Package declaration to match directory structure */
package Product_Review_Sorter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights lambda expressions as concise implementations for functional interfaces like Comparator and ActionListener, enabling flexible sorting and event handling in Jakarta EE-inspired e-commerce systems (Horstmann, p. 274). *Effective Java* (Item 42) advocates lambdas for single abstract method interfaces to simplify code in dynamic applications (Bloch, p. 200). */

/* Main class for product review sorter with lambda-based sorting and timer */
public class ProductReviewSorter {
    private static List<Review> reviews = new ArrayList<>();
    private static String[] funnyComments = {
            "This gadget turned my cat into a programmer!",
            "Bought this widget, now my coffee compiles faster!",
            "Quantum USB drive: 10/10, rewrote my binary destiny",
            "This gizmo debugged my life’s null pointer exceptions"
    };

    public static void main(String[] args) {
        /* Initialize reviews with funny comments */
        reviews.add(new Review(funnyComments[0], 5, LocalDate.of(2025, 10, 1)));
        reviews.add(new Review(funnyComments[1], 4, LocalDate.of(2025, 9, 28)));
        reviews.add(new Review(funnyComments[2], 5, LocalDate.of(2025, 10, 5)));
        reviews.add(new Review(funnyComments[3], 3, LocalDate.of(2025, 9, 15)));

        /* Convert List to array for sorting */
        Review[] reviewArray = reviews.toArray(new Review[0]);

        /* Sort by rating (descending) using lambda Comparator */
        Arrays.sort(reviewArray, (r1, r2) -> r2.getRating() - r1.getRating());
        System.out.println("Reviews sorted by rating (highest first):");
        displayFeedbackPage(reviewArray);
        System.out.println();

        /* Sort by review date using lambda Comparator */
        Arrays.sort(reviewArray, (r1, r2) -> r1.getReviewDate().compareTo(r2.getReviewDate()));
        System.out.println("Reviews sorted by review date:");
        displayFeedbackPage(reviewArray);
        System.out.println();

        /* Simulate new reviews with Timer and lambda ActionListener */
        Random random = new Random();
        Timer timer = new Timer(4000, event -> {
            String newComment = funnyComments[random.nextInt(funnyComments.length)];
            int newRating = random.nextInt(3) + 3; // Rating 3-5
            Review newReview = new Review(newComment, newRating, LocalDate.now());
            reviews.add(newReview);
            System.out.println("New review added: " + newReview);
            displayFeedbackPage(reviews.toArray(new Review[0]));
        });
        timer.start();

        /* Stop with JOptionPane */
        int option = JOptionPane.showConfirmDialog(
                null,
                "Stop browsing reviews?",
                "Product Feedback",
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.YES_OPTION) {
            timer.stop();
            System.out.println("Review browsing stopped. Back to shopping!");
        } else {
            System.out.println("Continuing to browse reviews... More feedback incoming!");
            // Note: Main thread ends, but timer would continue in a real app
        }
    }

    /* Helper method to display feedback page */
    private static void displayFeedbackPage(Review[] reviews) {
        System.out.println("=== Product Feedback Page ===");
        for (Review review : reviews) {
            System.out.println(review);
        }
        System.out.println("===========================\n");
    }
}