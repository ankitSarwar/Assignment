package JAVA_IO_15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//    9. Write a program to read data from properties file
public class PropertiesFileReadExample9 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("credentials.properties")) {
            properties.load(input);
            String value = properties.getProperty("password");
            System.out.println("username -> "+ properties.get("username"));
            System.out.println("Value: " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
