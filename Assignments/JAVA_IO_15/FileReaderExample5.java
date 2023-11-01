package JAVA_IO_15;

import java.io.FileReader;
import java.io.IOException;

//    5. Write a program to read text from .txt file using FileReader
public class FileReaderExample5 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("sample.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
