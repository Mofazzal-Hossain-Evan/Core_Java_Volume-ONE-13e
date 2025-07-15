package LibrarySystem;

public class Magazine extends LibraryItem implements Searchable {

    private int issue;

    public Magazine(String title, int id, int issue) {
        super(title, id);
        this.issue = issue;
    }

    @Override
    public String getDescription() {
        return "Magazine: " + title + ", Issue: " + issue;
    }

    @Override
    public boolean searchByTitle(String query) {
        return title.toLowerCase().contains(query.toLowerCase());
    }
}
