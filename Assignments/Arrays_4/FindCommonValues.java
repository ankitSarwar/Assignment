package Arrays_4;

import java.util.Arrays;
//11. Write a program to find the common values between two arrays
class FindCommonValues {
    public static int[] findCommonValues(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] common = new int[Math.min(arr1.length, arr2.length)];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                common[k] = arr1[i];
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(common, k);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] commonValues = findCommonValues(array1, array2);
        System.out.println("Common values: " + Arrays.toString(commonValues));
    }
}
