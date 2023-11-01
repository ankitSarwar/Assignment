package Arrays_4;

//17. Write a method to verify if the array contains two specified elements(12,23)
public class ContainsTwoElements {
    public static boolean containsTwoElements(int[] arr, int element1, int element2) {
        boolean foundElement1 = false;
        boolean foundElement2 = false;

        for (int value : arr) {
            if (value == element1) {
                foundElement1 = true;
            }
            if (value == element2) {
                foundElement2 = true;
            }

            if (foundElement1 && foundElement2) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 12, 15, 20, 23, 30};
        int element1 = 12;
        int element2 = 23;

        if (containsTwoElements(array, element1, element2)) {
            System.out.println("Array contains both elements " + element1 + " and " + element2);
        } else {
            System.out.println("Array does not contain both elements " + element1 + " and " + element2);
        }
    }
}
