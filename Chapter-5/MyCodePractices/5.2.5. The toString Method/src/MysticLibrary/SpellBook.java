package MysticLibrary;

public class SpellBook extends Book{
    private String incantation;

    public SpellBook(String title, String author, int pages, boolean isMagical, String incantation) {
        super(title, author, pages, isMagical);
        this.incantation = incantation;
    }

    @Override
    public String toString() {
        return super.toString() + "SpellBook{" +
                "incantation='" + incantation + '\'' +
                '}';
    }
}
