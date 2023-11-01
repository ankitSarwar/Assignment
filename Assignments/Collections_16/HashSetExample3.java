package Collections_16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample3 {
    public static void main(String[] args) {
        // Create a HashSet with at least 10 elements of type String
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Fig");
        stringSet.add("Grapes");
        stringSet.add("Lemon");
        stringSet.add("Mango");
        stringSet.add("Orange");
        stringSet.add("Pear");

        // Add an element to the HashSet
        stringSet.add("Strawberry");

        // Iterate through the HashSet using an Iterator
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Check if a specific element is in the HashSet
        String elementToCheck = "Cherry";
        boolean containsElement = stringSet.contains(elementToCheck);
        System.out.println("Contains " + elementToCheck + ": " + containsElement);

        // Check if the HashSet is empty
        boolean isEmpty = stringSet.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        // Print the size of the HashSet
        int setSize = stringSet.size();
        System.out.println("Size of the set: " + setSize);

        // Remove a specific element from the HashSet
        stringSet.remove("Mango");

        // Create a copy of the HashSet
        Set<String> copySet = new HashSet<>(stringSet);

        // Clear all elements from the HashSet
        stringSet.clear();
    }
}
