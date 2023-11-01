package Arrays_4;

import java.util.Arrays;
//7. Write a function to insert an element at a specific position in the array
public class InsertElementAtPosition {
    public static int[] insertElement(int[] arr, int element, int position) {
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position for insertion.");
            return arr;
        }

        int[] result = new int[arr.length + 1];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == position) {
                result[i] = element;
            } else {
                result[i] = arr[j];
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        int element = 3;
        int position = 2;
        int[] newArray = insertElement(array, element, position);
        System.out.println("Array after inserting " + element + " at position " + position + ": " + Arrays.toString(newArray));
    }
}
