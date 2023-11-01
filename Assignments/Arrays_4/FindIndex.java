package Arrays_4;

//3. Write a program to find the index of an array element
public class FindIndex {
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int index = findIndex(array, target);
        if (index != -1) {
            System.out.println("Index of " + target + " is: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
