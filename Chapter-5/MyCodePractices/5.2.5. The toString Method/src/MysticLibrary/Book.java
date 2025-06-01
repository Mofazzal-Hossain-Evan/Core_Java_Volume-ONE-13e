package MysticLibrary;

public class Book {
    private String title, author;
    private int pages;
    private boolean isMagical;

    public Book(String title, String author, int pages, boolean isMagical) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isMagical = isMagical;
    }



    @Override
    public String toString() {
        return getClass().getName() + "[title" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", isMagical=" + isMagical +
                ']';
    }
}
