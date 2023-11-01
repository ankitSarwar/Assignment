package Collections_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//    2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
//    Insert a Key value mapping into the map
//    Fetch the value of a Key
//    Create a clone/copy of HashMap
//    Check if the given Key is in the Map
//    Check if the value is in the Map
//    Check if the map is empty
//    Print the size of the Map to the console
//    Print all the Keys of the map to the console
//    Print all the Keys of the map to the console
//    Remove a specific Key-value pair
//    Copy all the elements of the Map to another Map
public class HashMapExample2 {
    public static void main(String[] args) {
        // Create a HashMap with student ID and name key-value pairs
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Ankit");
        studentMap.put(2, "Abhi");
        studentMap.put(3, "Suraj");
        studentMap.put(4, "David");
        studentMap.put(5, "Onkar");
        studentMap.put(6, "Om");
        studentMap.put(7, "pratham");
        studentMap.put(8, "Ganesh");
        studentMap.put(9, "Tony");
        studentMap.put(10, "Stark");

        // Insert a key-value mapping into the map
        studentMap.put(11, "Rushi");

        // Fetch the value of a key
        int keyToFetch = 5;
        String value = studentMap.get(keyToFetch);
        System.out.println("Value for key " + keyToFetch + ": " + value);

        // Create a clone/copy of the HashMap
        Map<Integer, String> copyMap = new HashMap<>(studentMap);

        // Check if a given key is in the map
        int keyToCheck = 8;
        boolean containsKey = studentMap.containsKey(keyToCheck);
        System.out.println("Contains key " + keyToCheck + ": " + containsKey);

        // Check if a value is in the map
        String valueToCheck = "Suraj";
        boolean containsValue = studentMap.containsValue(valueToCheck);
        System.out.println("Contains value " + valueToCheck + ": " + containsValue);

        // Check if the map is empty
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // Print the size of the map to the console
        int mapSize = studentMap.size();
        System.out.println("Size of the map: " + mapSize);

        // Print all the keys of the map to the console
        Set<Integer> keys = studentMap.keySet();
        System.out.println("Keys in the map: " + keys);

        // Remove a specific key-value pair
        int keyToRemove = 4;
        studentMap.remove(keyToRemove);

        // Copy all the elements of the map to another map
        Map<Integer, String> anotherMap = new HashMap<>(studentMap);
    }
}
