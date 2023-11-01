package Exceptions_14;

//    16. Write a program to generate NumberFormatException
public class ExceptionExample16 {
    public static void main(String[] args) {
        String text = "abc";
        int number = Integer.parseInt(text); // This will generate a NumberFormatException
    }
}
