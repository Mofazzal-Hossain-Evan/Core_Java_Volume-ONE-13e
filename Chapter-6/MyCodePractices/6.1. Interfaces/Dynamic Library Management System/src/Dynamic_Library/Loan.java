package Dynamic_Library;

import java.time.LocalDateTime;

public class Loan {
    private Book book;
    private Reader reader;
    private LocalDateTime loanData;
    private LocalDateTime dueDate;

    public Loan(Book book, Reader reader, LocalDateTime loanData) {
        this.book = book;
        this.reader = reader;
        this.loanData = loanData;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public Reader getReader() {
        return reader;
    }

    public LocalDateTime getLoanData() {
        return loanData;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }
}
