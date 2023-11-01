package Exceptions_14;

//    10. Write a program to generate ClassNotFoundException
public class ExceptionExample10 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("NonExistentClass"); // This will generate a ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
