package Arrays_4;

//19. Write a function to find the missing number of sorted array of 1 to 100
public class FindMissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = 10; // Assuming the array should have numbers from 1 to 10
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int missingNumber = findMissingNumber(array);
        System.out.println("Missing number in the array: " + missingNumber);
    }
}

