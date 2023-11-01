package Arrays_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//10. Write a function to find the duplicate values of an array
public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> duplicateElements = new ArrayList<>();

        for (int value : arr) {
            if (!uniqueElements.add(value)) {
                duplicateElements.add(value);
            }
        }

        return duplicateElements;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 4, 6};
        List<Integer> duplicates = findDuplicates(array);
        System.out.println("Duplicate elements: " + duplicates);
    }
}
