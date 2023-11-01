package Loops_3;

//5. Write a program to print largest number among three numbers.
public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("Largest number is: " + largest);
    }
}
