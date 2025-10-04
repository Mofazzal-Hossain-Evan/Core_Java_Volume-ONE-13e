/* Package declaration to match directory structure */
package Social_Feed_Poster;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights lambda expressions as concise alternatives to anonymous classes for implementing functional interfaces like ActionListener, simplifying event handling in simulations of Android social apps (Horstmann, p. 274). *Effective Java* (Item 42) advocates lambdas for single-method interfaces to reduce boilerplate and improve readability (Bloch, p. 200). */

/* Main class for social feed poster with lambda-based timers */
public class SocialFeedPoster {
    private static List<Post> feed = new ArrayList<>();
    private static int postIndex = 0;
    private static String[] memePosts = {
            "Lambda expressions: Because classes are so last decade",
            "When your code compiles on the first try: *rare Pepe*",
            "Java 8+ vibes: Lambdas or GTFO",
            "Debugging with System.out.println: The real MVP"
    };

    public static void main(String[] args) {
        /* Initialize feed with initial posts */
        feed.add(new Post("Welcome to the Lambda Feed!"));
        feed.add(new Post("Stay tuned for meme-worthy updates..."));

        /* First lambda-based ActionListener: Post new content every 2.5 seconds */
        Timer postTimer = new Timer(2500, event -> {
            if (postIndex < memePosts.length) {
                Post newPost = new Post(memePosts[postIndex++]);
                feed.add(newPost);
                System.out.println("New post added! Current feed:");
                displayFeed(); // Simulate Android feed refresh
            }
        });

        /* Second lambda-based ActionListener: Increment likes on existing posts every 4 seconds */
        Timer likeTimer = new Timer(4000, event -> {
            if (!feed.isEmpty()) {
                int randomPostIndex = (int) (Math.random() * feed.size());
                Post randomPost = feed.get(randomPostIndex);
                randomPost.setLikes(randomPost.getLikes() + 1);
                System.out.println("Likes incremented on: " + randomPost.getContent() + " (Now: " + randomPost.getLikes() + ")");
                displayFeed(); // Refresh display
            }
        });

        /* Start timers */
        postTimer.start();
        likeTimer.start();

        /* Exit with JOptionPane */
        int option = JOptionPane.showConfirmDialog(
                null,
                "Log out?",
                "Social Feed",
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.YES_OPTION) {
            postTimer.stop();
            likeTimer.stop();
            System.out.println("Logged out. Feed archived in lambda heaven!");
        } else {
            System.out.println("Staying logged in... More memes incoming!");
            // In a real app, timers would continue; here, main ends
        }
    }

    /* Helper method to display the feed with timestamps */
    private static void displayFeed() {
        System.out.println("=== Social Feed (Refreshed at " + LocalDateTime.now().toLocalTime() + ") ===");
        for (Post post : feed) {
            System.out.println(post);
        }
        System.out.println("=====================================\n");
    }
}