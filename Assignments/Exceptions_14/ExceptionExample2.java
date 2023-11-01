package Exceptions_14;

//   2. Handle the Arithmetic exception using try-catch block
public class ExceptionExample2 {
    public static void main(String[] args) {
        try {
            int result = 5 / 0;
            System.out.println("Result: " + result); // This will not be executed
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }
    }
}
