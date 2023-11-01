package JAVA_IO_15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//    8. Write text to a .txt file using BufferedWriter
public class BufferedWriterExample8 {
    public static void main(String[] args) {
        String text = "This is a sample text to write to a file using BufferedWriter.";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output8.txt"))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
