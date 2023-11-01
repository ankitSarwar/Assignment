package Arrays_4;

//13. Write a method to find the second largest number in an array
public class FindSecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array does not have a second largest element.");
            return -1;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > firstMax) {
                secondMax = firstMax;
                firstMax = value;
            } else if (value > secondMax && value != firstMax) {
                secondMax = value;
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 2, 7, 5, 8, 3};
        int secondLargest = findSecondLargest(array);
        if (secondLargest != -1) {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
