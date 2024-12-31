import java.util.Scanner;

public class StringEqualityTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the first string:");
        String firstString = input.nextLine();

        System.out.println("Enter the second string:");
        String secondString = input.nextLine();

        if(firstString.equals(secondString)) {
            System.out.println("The strings are equal using equals().");
        } else {
            System.out.println("The strings are NOT equal using equals().");
        }

        if(firstString == secondString) {
            System.out.println("The strings are identical in memory using ==.");
        } else {
            System.out.println("The strings are NOT identical in memory using ==.");
        }

        int comparisonResult = firstString.compareToIgnoreCase(secondString);

        if(comparisonResult == 0 ){
            System.out.println("The strings are equal using compareTo().");
        } else if (comparisonResult < 0) {
            System.out.println("The first string comes before the second string lexicographically.");
        } else {
            System.out.println("The first string comes after the second string lexicographically.");
        }

        input.close();
    }
}

/***
 Explanation of the Code:
 equals Method:

 Compares the contents of the two strings.
 Example: "Hello".equals("hello") returns false.
 equalsIgnoreCase Method:

 Compares strings, ignoring case differences.
 Example: "Hello".equalsIgnoreCase("hello") returns true.
 == Operator:

 Compares memory addresses, not the content.
 Example: If two strings point to the same memory location, == will return true.
 compareTo Method:

 Returns 0 if the strings are equal.
 Returns a negative value if the first string is lexicographically smaller.
 Returns a positive value if the first string is lexicographically larger.
 ***/