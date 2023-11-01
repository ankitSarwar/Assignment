package JAVA_IO_15;

import java.io.FileWriter;
import java.io.IOException;

//    6. Write a program to write text to .txt file using FileWriter
public class FileWriterExample6 {
    public static void main(String[] args) {
        String text = "This is a sample text to write to a file using FileWriter.";
        try (FileWriter writer = new FileWriter("output6.txt")) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
