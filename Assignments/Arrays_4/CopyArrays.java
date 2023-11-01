package Arrays_4;

import java.util.Arrays;

//6. Write a function to copy an array to another array
public class CopyArrays {
    public static int[] copyArray(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        return copy;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = copyArray(originalArray);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}
