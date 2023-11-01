package Collections_16;

import java.util.ArrayList;
import java.util.Iterator;

//      16. Collections
//    1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
//    ArrayList and perform the below operations
//    Add an element to the ArrayList
//    Iterate through the ArrayList by using Iterator object
//    Add an element at a specific index
//    Remove an element from the ArrayList, Remove at an index
//    Update the element at a specific index
//    Check the element is present at a particular index
//    Get an element at a particular index
//    Find out the size of the ArrayList
//    Check the given element is present in the ArrayList
//    Remove all elements of the ArrayList
public class ArrayListExample1 {
    public static void main(String[] args) {
        // Create an ArrayList of type String with 10 string elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");
        arrayList.add("Six");
        arrayList.add("Seven");
        arrayList.add("Eight");
        arrayList.add("Nine");
        arrayList.add("Ten");

        // Add an element to the ArrayList
        arrayList.add("Eleven");

        // Iterate through the ArrayList using an Iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add an element at a specific index
        arrayList.add(3, "InsertedAtThree");

        // Remove an element from the ArrayList (Remove "Seven")
        arrayList.remove("Seven");

        // Remove an element at a specific index (Remove element at index 5)
        arrayList.remove(5);

        // Update the element at a specific index (Update element at index 2)
        arrayList.set(2, "NewValue");

        // Check if the element is present at a particular index
        int indexToCheck = 4;
        if (indexToCheck >= 0 && indexToCheck < arrayList.size()) {
            System.out.println("Element at index " + indexToCheck + ": " + arrayList.get(indexToCheck));
        } else {
            System.out.println("Index " + indexToCheck + " is out of bounds.");
        }

        // Find out the size of the ArrayList
        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size);

        // Check if the given element is present in the ArrayList
        String elementToCheck = "Five";
        boolean containsElement = arrayList.contains(elementToCheck);
        System.out.println("Contains " + elementToCheck + ": " + containsElement);

        // Remove all elements from the ArrayList
        arrayList.clear();
    }
}
