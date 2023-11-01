package Static_5;

//1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
//        methods and a main method.
public class StaticInstanceExample {
    // Static variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // Instance variables
    int instanceVar1 = 5;
    int instanceVar2 = 15;

    // Static methods
    public static void staticMethod1() {
        System.out.println("Inside staticMethod1");
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }

    public static void staticMethod2() {
        System.out.println("Inside staticMethod2");
        // Accessing instance variables in a static method is not allowed directly.
        // You need an instance of the class to access instance variables.
    }

    // Instance methods
    public void instanceMethod1() {
        System.out.println("Inside instanceMethod1");
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);

        // Calling a static method from an instance method
        staticMethod1();
    }

    public void instanceMethod2() {
        System.out.println("Inside instanceMethod2");
        // Accessing static variables in an instance method
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        // Calling an instance method from an instance method
        instanceMethod1();
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method");

        // Accessing static variables in the main method
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        // Creating an instance of the class
        StaticInstanceExample example = new StaticInstanceExample();

        // Accessing instance variables in the main method via the instance
        System.out.println("Instance Variable 1: " + example.instanceVar1);
        System.out.println("Instance Variable 2: " + example.instanceVar2);

        // Calling static methods from the main method
        staticMethod1();
        staticMethod2();

        // Calling instance methods from the main method via the instance
        example.instanceMethod1();
        example.instanceMethod2();
    }
}


