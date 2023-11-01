package Interfaces_10;

import static Interfaces_10.MyInterface1.MY_CONSTANT;

//11. Create an interface with static final variable
interface MyInterface1 {
    // Static final variable (implicitly)
    int MY_CONSTANT = 42;

    void myMethod();
}

class MyClass1 implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Method in MyClass");
        System.out.println("Value of MY_CONSTANT: " + MY_CONSTANT);
    }
}

public class InterfaceExample11 {
    public static void main(String[] args) {
        MyClass1 myObject = new MyClass1();
        myObject.myMethod();
    }
}
