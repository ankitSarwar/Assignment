package Arrays_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//12. Write a method to remove duplicate elements from an array
public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int value : arr) {
            if (!list.contains(value)) {
                list.add(value);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6};
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}
