package cloning_project1;

import java.util.ArrayList;
import java.util.List;

/* Book ক্লাস যা Cloneable ইন্টারফেস ইমপ্লিমেন্ট করছে */
public class Book implements Cloneable {
    private String title;                  // বইয়ের নাম
    private String author;                 // লেখক
    private List<String> chapters;         // chapters লিস্ট (mutable)

    public Book(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        // chapters লিস্ট সরাসরি assign করা হয়েছে (shallow)
        this.chapters = chapters;
    }

    /* Shallow clone */
    @Override
    public Book clone() {
        try {
            // শুধু super.clone() ব্যবহার করা হয়েছে, chapters লিস্ট deep copy করা হয়নি
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone failed!");
        }
    }

    /* chapters add করার সুবিধা */
    public void addChapter(String chapter) {
        chapters.add(chapter);
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', chapters=" + chapters + "}";
    }

    // Getter
    public List<String> getChapters() { return chapters; }
}
