package Constructors_12;

//  3. Apply private, public, protected and default access modifiers to the constructor
class MyClass3 {
    public MyClass3() {
        System.out.println("Public constructor");
    }

    private MyClass3(int value) {
        System.out.println("Private constructor with value: " + value);
    }

    protected MyClass3(String text) {
        System.out.println("Protected constructor with text: " + text);
    }

    MyClass3(boolean flag) {
        System.out.println("Default (package-private) constructor with flag: " + flag);
    }
}

public class ConstructorExample3 {
    public static void main(String[] args) {
        MyClass3 obj1 = new MyClass3();              // Public constructor
        // MyClass obj2 = new MyClass(42);        // Private constructor (cannot be accessed)
        // MyClass obj3 = new MyClass("Hello");  // Protected constructor (cannot be accessed)
        MyClass3 obj4 = new MyClass3(true);          // Default (package-private) constructor
    }
}
