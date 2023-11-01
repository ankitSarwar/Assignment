package Exceptions_14;

//    9. Write a program to generate ArrayIndexOutOfBoundException
public class ExceptionExample9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int index = 5; // Index out of bounds
        System.out.println(numbers[index]); // This line will generate an ArrayIndexOutOfBoundsException
    }
}
