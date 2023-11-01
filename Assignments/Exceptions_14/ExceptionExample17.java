package Exceptions_14;

//    17. Write a program to generate StringIndexOutOfBoundsException
public class ExceptionExample17 {
    public static void main(String[] args) {
        String text = "Hello";
        char character = text.charAt(10); // This will generate a StringIndexOutOfBoundsException
    }
}
