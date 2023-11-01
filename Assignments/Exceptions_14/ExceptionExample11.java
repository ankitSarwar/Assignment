package Exceptions_14;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//    11. Write a program to generate FileNotFoundException
public class ExceptionExample11 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("NonExistentFile.txt"); // This will generate a FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
