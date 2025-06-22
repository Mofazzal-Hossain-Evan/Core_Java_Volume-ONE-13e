package Dynamic_Library;

import java.time.LocalDateTime; // Imports LocalDateTime for handling dates
import java.time.format.DateTimeFormatter; // Imports DateTimeFormatter for formatting
import java.util.ArrayList; // Imports ArrayList for loans
import java.util.List; // Imports List interface
import java.util.Timer; // Imports Timer for scheduling
import java.util.TimerTask; // Imports TimerTask for tasks
import java.awt.event.ActionEvent; // Imports ActionEvent for ActionListener
import java.awt.event.ActionListener; // Imports ActionListener for reminders

// LoanManager class to handle loans with an inner class for reminders
class LoanManager implements LoanOperations {
    private List<Loan> loans; // Stores list of active loans
    private Timer timer; // Timer for scheduling reminders

    // Inner class for handling overdue reminders
    private class ReminderHandler implements ActionListener {
        private LocalDateTime currentTime; // Stores current time for checking due dates

        public ReminderHandler(LocalDateTime currentTime) { // Constructor for ReminderHandler
            this.currentTime = currentTime; // Initializes current time
        }

        @Override
        public void actionPerformed(ActionEvent e) { // Implements ActionListener for reminders
            loans.forEach(loan -> { // Iterates through all loans
                if (loan.getDueDate().isBefore(currentTime)) { // Checks if loan is overdue
                    System.out.println("Reminder: Book '" + loan.getBook().getTitle() + // Prints overdue reminder
                            "' borrowed by " + loan.getReader().getName() +
                            " is overdue! Due: " + loan.getDueDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                }
            });
        }
    }

    public LoanManager(LocalDateTime currentTime) { // Constructor for LoanManager
        this.loans = new ArrayList<>(); // Initializes loans list
        this.timer = new Timer(); // Initializes timer
        // Schedules reminder task every 60 seconds
        timer.schedule(new TimerTask() { // Creates a new TimerTask
            @Override
            public void run() { // Defines task behavior
                new ReminderHandler(currentTime).actionPerformed(null); // Triggers reminder check
            }
        }, 0, 60000); // Starts immediately, repeats every 60 seconds
    }

    @Override
    public void borrowBook(Book book, Reader reader) { // Implements borrowBook method
        if (book.isAvailable()) { // Checks if book is available
            book.setAvailable(false); // Marks book as borrowed
            loans.add(new Loan(book, reader, LocalDateTime.now())); // Adds new loan
            System.out.println("Book '" + book.getTitle() + "' borrowed by " + reader.getName()); // Confirms borrowing
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available"); // Reports book unavailability
        }
    }

    @Override
    public void returnBook(Book book) { // Implements returnBook method
        loans.removeIf(loan -> loan.getBook() == book); // Removes loan for the book
        book.setAvailable(true); // Marks book as available
        System.out.println("Book '" + book.getTitle() + "' returned"); // Confirms return
    }

    public List<Loan> getLoans() { // Getter for loans
        return loans; // Returns list of loans
    }
}