package javaBasic_1;

// Q 1. How to create a class, object, method and its signature
public class MyClass_1 {
    int myVariable; // Class-level variable

    // Constructor (method with the same name as the class)
    public MyClass_1(int value) {
        myVariable = value;
    }

    // Method with a signature
    public void printValue() {
        System.out.println("Value: " + myVariable);
    }

    public static void main(String[] args) {
        MyClass_1 myObject = new MyClass_1(42); // Creating an object
        myObject.printValue(); // Calling the method
    }
}

