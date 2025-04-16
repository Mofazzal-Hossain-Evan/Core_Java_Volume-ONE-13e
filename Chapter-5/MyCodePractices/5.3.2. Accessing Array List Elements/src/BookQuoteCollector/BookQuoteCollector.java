package BookQuoteCollector;

import java.util.ArrayList;
import java.util.Scanner;

public class BookQuoteCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Quote> quoteList = new ArrayList<>();

        //step 1
        quoteList.add(new Quote("1984", "Big Brother is watching you.", 3));
        quoteList.add(new Quote("The Hobbit", "Not all those who wander are lost.", 42));
        quoteList.add(new Quote("Pride and Prejudice", "I could easily forgive his pride, if he had not mortified mine.", 57));

        System.out.println("📚 Initial Favorite Quotes:");
        printQuotes(quoteList);

        //step 2

        System.out.println("\n➕ Adding a quote in the middle (index 1)...");
        quoteList.add(1,new Quote("To Kill a Mockingbird", "You never really understand a person until you consider things from his point of view.", 39));
        printQuotes(quoteList);

        // Step 3: Update a quote using set()
        System.out.println("\n✏️ Updating quote at index 2...");
        quoteList.set(2, new Quote("The Hobbit", "There is nothing like looking, if you want to find something.", 47));
        printQuotes(quoteList);

        // Step 4: Remove a quote
        System.out.println("\n❌ Removing quote at index 0...");
        quoteList.remove(1);
        printQuotes(quoteList);

        // Step 5: Search quote by book name
        System.out.print("\n🔍 Enter book name to search quotes: ");
        String searchBook = scanner.nextLine();
        boolean found = false;

        for (Quote q : quoteList){
            if (q.getBookName().equalsIgnoreCase(searchBook)){
                System.out.println("✅ Found: " + q);
                found = true;
            }
        }
        if (!found){
            System.out.println("❌ No quotes found from book: " + searchBook);

            // Step 6: Convert to array and print
            System.out.println("\n📦 Copying all quotes to array...");
            Quote[] quoteArray = new Quote[quoteList.size()];
            quoteList.toArray(quoteArray);
            for (Quote q : quoteArray){
                System.out.println(q);
            }
            scanner.close();
        }
    }

    public static void printQuotes(ArrayList<Quote> list){
        for (Quote q : list){
            System.out.println(q);
        }
    }
}
