package Exceptions_14;

//  1. Write a program to generate Arithmetic Exception without exception handling
public class ExceptionExample1 {
    public static void main(String[] args) {
        int result = 5 / 0; // This line will generate an ArithmeticException
        System.out.println("Result: " + result); // This will not be executed
    }
}




