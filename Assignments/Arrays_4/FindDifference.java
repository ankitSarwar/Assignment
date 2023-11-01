package Arrays_4;

//16. Write a function to get the difference of largest and smallest value
class FindDifference {
    public static int findDifferenceBetweenMinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return -1;
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 8, 3};
        int difference = findDifferenceBetweenMinMax(array);
        if (difference != -1) {
            System.out.println("Difference between the largest and smallest values: " + difference);
        }
    }
}
