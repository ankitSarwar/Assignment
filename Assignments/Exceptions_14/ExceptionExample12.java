package Exceptions_14;

import java.io.IOException;

//    12. Write a program to generate IOException
public class ExceptionExample12 {
    public static void main(String[] args) {
        try {
            throw new IOException("Custom IOException Message");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
