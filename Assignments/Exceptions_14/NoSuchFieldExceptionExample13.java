package Exceptions_14;
import java.lang.reflect.Field;

//    13. Write a program to generate NoSuchFieldException
public class NoSuchFieldExceptionExample13 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = SomeClass.class;
            Field field = clazz.getField("nonExistentField"); // This will generate a NoSuchFieldException
        } catch (NoSuchFieldException e) {
            System.out.println("Field not found: " + e.getMessage());
        }
    }
}

class SomeClass {
    // No field named "nonExistentField" here
}
