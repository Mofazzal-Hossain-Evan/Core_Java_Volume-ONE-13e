public class ImmutableStringExample {

    public static void main(String[] args) {

        String greeting = "hello";

        int n = greeting.indexOf("lo");
        String modifiedGreeting = greeting.substring(1,n);
        System.out.println("Original String: " + greeting);  // "Hello"
        System.out.println("Modified String: " + modifiedGreeting);  // "Help!"
        // Reassignment creates a new reference

        greeting = "Howdy";
        System.out.println("Reassigned String: " + greeting);  // "Howdy"
    }


}