package BookQuoteCollector;

public class Quote {
    private String bookName;
    private String quoteText;
    private int pageNumber;

    public Quote(String bookName, String quoteText, int pageNumber) {
        this.bookName = bookName;
        this.quoteText = quoteText;
        this.pageNumber = pageNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "📘 " + bookName + " (Page " + pageNumber + "): \"" + quoteText + "\"";
    }
}
