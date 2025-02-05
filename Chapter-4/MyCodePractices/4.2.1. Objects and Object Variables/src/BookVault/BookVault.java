package BookVault;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookVault {

private static ArrayList<Book> books = new ArrayList<>();
private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        while(true) {
            System.out.println("\n1. Add Book\n2. Search Book\n3. Remove Book\n4. Show All Books\n5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
case 1 -> addBook();
case 2 -> searchBook();
case 3 -> removeBook();
case 4 ->showAllBooks();
case 5 -> System.exit(0);
                default -> System.out.println("invalid");

            }
        }
    }

    private static void addBook() {
        System.out.println("Enter book title: ");
        String title = scanner.nextLine();
        System.out.println("Enter book author: ");
        String author = scanner.nextLine();
        books.add(new Book(title, author));
        System.out.println("Book added successfully");
    }

    private static void searchBook() {
        System.out.println("Enter book title to search");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found");
    }

    private static void removeBook() {
        System.out.println("Enter book title to remove: ");
        String title = scanner.nextLine();
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        System.out.println("Book removed if it existed.");
    }

    private static void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books in the collection");
        } else {
            books.forEach(System.out::println);
        }
    }
}
