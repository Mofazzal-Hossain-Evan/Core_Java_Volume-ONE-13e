package MysticLibrary;

public class CursedScroll extends Book{
    private int dangerLevel;

    public CursedScroll(String title, String author, int pages, boolean isMagical, int dangerLevel) {
        super(title, author, pages, isMagical);
        this.dangerLevel = dangerLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "CursedScroll{" +
                "dangerLevel=" + dangerLevel +
                '}';
    }
}
