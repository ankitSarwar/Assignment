package Operators_2;

//3. Program to equal operator and not equal operators
public class EqualityOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        boolean isEqual = (num1 == num2);
        boolean isNotEqual = (num1 != num2);

        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
    }
}
