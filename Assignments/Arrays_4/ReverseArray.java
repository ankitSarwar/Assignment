package Arrays_4;

import java.util.Arrays;
//9. Write a function to reverse an array of integer values
public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        int currentIndex = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[currentIndex] = arr[i];
            currentIndex++;
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(originalArray);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}
