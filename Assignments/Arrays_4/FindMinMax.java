package Arrays_4;

//8. Write a function to find the minimum and maximum value of an array
public class FindMinMax {
    public static void findMinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int value : arr) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 8, 3};
        findMinMax(array);
    }
}
