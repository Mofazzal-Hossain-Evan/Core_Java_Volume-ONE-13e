/* Package declaration to match directory structure */
package Social_Feed_Poster;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) discusses using classes like Post to manage data in simulations, enabling lambda-based operations for dynamic updates in Android-like apps (Horstmann, p. 274). *Effective Java* (Item 42) recommends concise data structures for functional programming paradigms (Bloch, p. 200). */

/* Post class with basic fields */
import java.time.LocalDateTime;

public class Post {
    private String content;
    private int likes;
    private LocalDateTime postTime;

    public Post(String content) {
        this.content = content;
        this.likes = 0;
        this.postTime = LocalDateTime.now();
    }

    // Getters
    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public LocalDateTime getPostTime() {
        return postTime;
    }

    @Override
    public String toString() {
        return "[" + postTime.toLocalTime() + "] " + content + " (Likes: " + likes + ")";
    }
}