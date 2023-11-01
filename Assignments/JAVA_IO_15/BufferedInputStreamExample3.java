package JAVA_IO_15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//    3. Read text from a .txt file using BufferedInputStream
public class BufferedInputStreamExample3 {
    public static void main(String[] args) {
        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream("sample.txt"))) {
            byte[] data = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(data)) != -1) {
                System.out.print(new String(data, 0, bytesRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
