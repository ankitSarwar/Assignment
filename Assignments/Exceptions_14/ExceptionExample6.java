package Exceptions_14;

//    6. Write a program to create your own exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class ExceptionExample6 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom Exception Message");
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
