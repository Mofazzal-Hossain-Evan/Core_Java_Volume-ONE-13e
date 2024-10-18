public class switchSample {
    public static void main(String[] args) {
        String seasonName = "Fall"; // You can change this to test different cases

        int numLetters = switch (seasonName) {
            case "Spring", "Summer", "Winter" -> 6;
            case "Fall" -> 4;
            default -> -1;
        };

        System.out.println("The number of letters in \"" + seasonName + "\" is: " + numLetters);
    }
}
