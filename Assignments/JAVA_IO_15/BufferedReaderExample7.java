package JAVA_IO_15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//    7. Read text from a .txt file using BufferedReader
public class BufferedReaderExample7 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
