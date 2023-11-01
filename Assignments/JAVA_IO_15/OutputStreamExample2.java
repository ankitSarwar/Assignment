package JAVA_IO_15;

import java.io.FileOutputStream;
import java.io.IOException;

//    2. Write a program to write text to .txt file using OutputStream
public class OutputStreamExample2 {
    public static void main(String[] args) {
        String text = "This is a sample text to write to a file.";
        try (FileOutputStream output = new FileOutputStream("output.txt")) {
            byte[] data = text.getBytes();
            output.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
