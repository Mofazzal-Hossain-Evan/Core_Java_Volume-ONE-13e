import java.util.HashMap;

public class FrequencyCounter {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5};
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for ( int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        /*
        * Initialization of the HashMap:

A HashMap is created to store the frequency of each number in the numbers array.
The key in the HashMap is the number (num),
and the value is the count of how many times that number appears in the array.
Loop through the array:

The for loop iterates through each element in the numbers array.
Using getOrDefault:

frequencyMap.getOrDefault(num, 0) checks if the current number (num) is already in the map.
If the number exists in the map, it retrieves the current count (value).
If the number does not exist, it returns the default value 0.
Updating the map:

The value for the current number is incremented by 1:

frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

If the number is already in the map, its count is increased.
If the number is not in the map, it is added with an initial count of 1.
* */
        
        System.out.println("Frequency of Numbers:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + ": "+ frequencyMap.get(key) + " times");
        }
        
        
    }
    

}
