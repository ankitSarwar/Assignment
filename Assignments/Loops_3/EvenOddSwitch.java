package Loops_3;

//11. Program to check whether a number is EVEN or ODD using switch
public class EvenOddSwitch {
    public static void main(String[] args) {
        int number = 15; // Change this number as needed

        switch (number % 2) {
            case 0:
                System.out.println(number + " is an even number.");
                break;
            case 1:
                System.out.println(number + " is an odd number.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
