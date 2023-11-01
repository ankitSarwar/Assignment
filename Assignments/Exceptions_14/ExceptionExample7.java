package Exceptions_14;

//    7. Write a program with finally block
public class ExceptionExample7 {
    public static void main(String[] args) {
        try {
            int result = 5 / 0; // This line will generate an ArithmeticException
            System.out.println("Result: " + result); // This will not be executed
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
