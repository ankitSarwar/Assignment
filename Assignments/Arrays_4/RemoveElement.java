package Arrays_4;

import java.util.Arrays;

//5. Write a function to remove a specific element from an array
public class RemoveElement {
    public static int[] removeElement(int[] arr, int target) {
        int[] result = new int[arr.length - 1];
        int currentIndex = 0;

        for (int value : arr) {
            if (value != target) {
                result[currentIndex] = value;
                currentIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int[] newArray = removeElement(array, target);
        System.out.println("Array after removing " + target + ": " + Arrays.toString(newArray));
    }
}
