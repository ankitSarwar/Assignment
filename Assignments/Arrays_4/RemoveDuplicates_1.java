package Arrays_4;

import java.util.Arrays;
import java.util.LinkedHashSet;

//18. Write a program to remove the duplicate elements and return the new array
class RemoveDuplicates_1 {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        int[] uniqueArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            uniqueArray[index] = num;
            index++;
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6};
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}
