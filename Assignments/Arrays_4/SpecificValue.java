package Arrays_4;

//4. Write a function to test if array contains a specific value
public class SpecificValue {
    public static boolean containsValue(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        boolean contains = containsValue(array, target);
        if (contains) {
            System.out.println("Array contains " + target);
        } else {
            System.out.println("Array does not contain " + target);
        }
    }
}
