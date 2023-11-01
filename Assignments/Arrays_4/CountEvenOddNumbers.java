package Arrays_4;

//15. Write a method to find number of even number and odd numbers in an array
 class CountEvenOddNumbers {
    public static int[] countEvenOddNumbers(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
//        int even
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println("even "+ num);
                evenCount++;
            } else {
                System.out.println("odd "+ num);
                oddCount++;
            }
        }

        int[] counts = {evenCount, oddCount};
        return counts;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] counts = countEvenOddNumbers(array);

        System.out.println("Number of even numbers: " + counts[0]);
        System.out.println("Number of odd numbers: " + counts[1]);
    }
}
