package Dynamic_Library;

public interface LoanOperations {
    void borrowBook(Book book, Reader reader);
    void returnBook(Book book);
}
