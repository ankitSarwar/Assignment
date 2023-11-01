package JAVA_IO_15;

import java.io.FileInputStream;
import java.io.IOException;

//1. Write a program to read text from .txt file using InputStream
public class FileReadExample1 {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("sample.txt")) {
            int data;
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
