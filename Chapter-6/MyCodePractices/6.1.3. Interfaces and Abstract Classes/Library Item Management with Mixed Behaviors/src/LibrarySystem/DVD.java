package LibrarySystem;

public class DVD extends LibraryItem implements Borrowable {

    private int durationMinutes;

    public DVD(String title, int id, int durationMinutes) {
        super(title, id);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String getDescription() {
        return "DVD: " + title + " (" + durationMinutes + " mins)";
    }

    @Override
    public void borrow() {
        System.out.println(title + " DVD has been borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println(title + " DVD has been returned.");
    }
}
