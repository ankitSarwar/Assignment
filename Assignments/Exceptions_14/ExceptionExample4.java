package Exceptions_14;

//    4. Write a program with multiple catch blocks
public class ExceptionExample4 {
    public static void main(String[] args) {
        try {
            int result = 5 / 0;
            String value = null;
            value.length(); // This line will generate a NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught: " + e.getMessage());
        }
    }
}
