package JAVA_IO_15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//    4. Write text to a .txt file using BufferedOutputStream
public class BufferedOutputStreamExample4 {
    public static void main(String[] args) {
        String text = "This is a sample text to write to a file using BufferedOutputStream.";
        try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("output2.txt"))) {
            byte[] data = text.getBytes();
            output.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
