package Exceptions_14;
import java.lang.reflect.Method;

//    14. Write a program to generate NoSuchMethodException
public class NoSuchMethodExceptionExample14 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = SomeClass.class;
            Method method = clazz.getMethod("nonExistentMethod"); // This will generate a NoSuchMethodException
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        }
    }
}


