package Arrays_4;

//2. Write a function to calculate the average value of an array of integers
public class CalculateAverage {
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = calculateAverage(array);
        System.out.println("Average of the array elements: " + average);
    }
}
