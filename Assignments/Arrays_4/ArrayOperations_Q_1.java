package Arrays_4;

import java.util.Arrays;

//1. Write a function to add integer values of an array
public class ArrayOperations_Q_1 {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int result = sumArray(array);
        System.out.println("Sum of the array elements: " + result);
    }
}


