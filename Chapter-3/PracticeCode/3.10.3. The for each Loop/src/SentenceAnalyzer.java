import java.util.HashMap;

public class SentenceAnalyzer {
    
    public static void main(String[] args) {
        String sentence = "java ";
        sentence = sentence.toLowerCase().replaceAll("\\s", "");//remove space
        
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char ch : sentence.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            
        }
        
        System.out.println("Character Frequencies:");
        
        for (char key : frequencyMap.keySet()) {
            System.out.println(key + ": " + frequencyMap.get(key));
        }
    }
}

/**
 Step-by-Step Explanation:
 frequencyMap.getOrDefault(ch, 0)
 This method retrieves the value associated with the key ch in the frequencyMap.
 If ch is already present in the map, it returns the current frequency (value) associated with ch.
 If ch is not present in the map, it returns the default value 0.
 
 Example:
 If frequencyMap = {'a': 2, 'b': 1} and ch = 'a', this will return 2.
 If ch = 'c' (which is not in the map), this will return 0.
 frequencyMap.getOrDefault(ch, 0) + 1
 
 After retrieving the current frequency of ch (or 0 if it doesn't exist), we add 1 to it.
 This increases the count for the key ch by 1.
 frequencyMap.put(ch, ...)
 
 The put method updates the map by inserting the key-value pair (ch, updatedCount).
 If the key ch is already in the map, the value is overwritten with the new count.
 If the key ch is not in the map, the key is added to the map with the initial count 1.
 *
 */

