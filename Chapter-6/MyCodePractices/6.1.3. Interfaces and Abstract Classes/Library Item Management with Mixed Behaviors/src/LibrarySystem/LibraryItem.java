package LibrarySystem;

public abstract class LibraryItem {
    protected String title;
    protected int id;

    public LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public abstract String getDescription();

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
}
