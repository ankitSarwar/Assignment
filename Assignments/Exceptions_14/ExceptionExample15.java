package Exceptions_14;

//    15. Write a program to generate NullPointerException
public class ExceptionExample15 {
    public static void main(String[] args) {
        String text = null;
        System.out.println(text.length()); // This line will generate a NullPointerException
    }
}
