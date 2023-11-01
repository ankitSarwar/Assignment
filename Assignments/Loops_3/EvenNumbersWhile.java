package Loops_3;

//6. Write a program to print even number between 10 and 100 using while
public class EvenNumbersWhile {
    public static void main(String[] args) {
        int number = 10;
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println("Even: " + number);
            }
            number++;
        }
    }
}
