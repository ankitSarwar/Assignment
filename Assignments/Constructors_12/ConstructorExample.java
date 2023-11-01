package Constructors_12;

//    1. Write a class with a default constructor, one argument constructor and two argument
//    constructors. Instantiate the class to call all the constructors of that class from a main
//    class
class MyClass {
    MyClass() {
        System.out.println("Default constructor");
    }

    MyClass(int value) {
        System.out.println("One-argument constructor with value: " + value);
    }

    MyClass(int value1, int value2) {
        System.out.println("Two-argument constructor with values: " + value1 + " and " + value2);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();           // Calling default constructor
        MyClass obj2 = new MyClass(42);         // Calling one-argument constructor
        MyClass obj3 = new MyClass(10, 20);     // Calling two-argument constructor
    }
}




