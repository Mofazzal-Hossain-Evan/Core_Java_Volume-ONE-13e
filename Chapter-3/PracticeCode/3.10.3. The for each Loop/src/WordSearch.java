public class WordSearch {
    public static void main(String[] args) {
        
        char[][] grid = {
                {'c', 'a', 't'},
                {'d', 'o', 'g'},
                {'r', 'a', 't'}
        };
        
        String wordToFind = "cat";
        boolean found = false;
        
        for (char[] row : grid) {
            String rowString = new String(row);
            if(rowString.contains(wordToFind)) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Word \"" + wordToFind + "\" found in the grid!");
            
        } else {
            System.out.println("Word \"" + wordToFind + "\" not found in the grid.");
        }
    }
}
