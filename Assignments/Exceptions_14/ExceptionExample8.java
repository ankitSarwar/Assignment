package Exceptions_14;

//    8. Write a program to generate Arithmetic Exception
public class ExceptionExample8 {
    public static void main(String[] args) {
        int result = 5 / 0; // This line will generate an ArithmeticException
        System.out.println("Result: " + result); // This will not be executed
    }
}
