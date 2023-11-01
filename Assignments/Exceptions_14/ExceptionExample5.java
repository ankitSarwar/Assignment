package Exceptions_14;

//    5. Write a program to throw exception with your own message
public class ExceptionExample5 {
    public static void main(String[] args) {
        try {
            throw new Exception("Custom Exception Message");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
