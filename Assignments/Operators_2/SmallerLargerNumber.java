package Operators_2;

//7. Print the smaller and larger number
public class SmallerLargerNumber {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;

        int smaller = (num1 < num2) ? num1 : num2;
        int larger = (num1 > num2) ? num1 : num2;

        System.out.println("Smaller number: " + smaller);
        System.out.println("Larger number: " + larger);
    }
}
