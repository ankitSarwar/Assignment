package Interfaces_10;
//    1. Create an interface with only one method and implement it in a class. Call the method
//    implemented
interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Method implemented from MyInterface");
    }
}

//    2. Create an interface with two methods, but implement only one in a class. Call the
//    method implemented.
interface MyInterface2 {
    void method1();
    void method2();
}

class MyClass2 implements MyInterface2 { // error becuse we call only one method but interface need to implement all method
    @Override
    public void method1() {
        System.out.println("Method1 implemented from MyInterface2");
    }

    @Override
    public void method2() {

    }
}

//3. Use Interface instances to call the implemented method in the implemented class
public class InterfaceExample2 {
    public static void main(String[] args) {
        MyInterface2 myInstance = new MyClass2();
        myInstance.method1(); // Call implemented method1
//      output error ->  java: Interfaces_10.MyClass2 is not abstract and does not override abstract method method2() in Interfaces_10.MyInterface2


    }
}

//        4. Create two interfaces with one method each. Implement these two interfaces in one
//        class.
//Ans -> we need implement both interface method
interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyCombinedClass implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("MethodA implemented");
    }

    @Override
    public void methodB() {
        System.out.println("MethodB implemented");
    }
}

class InterfaceExample44 {
    public static void main(String[] args) {
        MyCombinedClass myObject = new MyCombinedClass();
        myObject.methodA(); // Call methodA
        myObject.methodB(); // Call methodB
    }
}


//        5. Create two interfaces with the same method (same signature) in both the interfaces.
//        Implement these two interfaces in one class. Call the method.
interface InterfaceX {
    void commonMethod();
}

interface InterfaceY {
    void commonMethod();
}

class MyCommonClass implements InterfaceX, InterfaceY {
    @Override
    public void commonMethod() {
        System.out.println("CommonMethod implemented");
    }
}

class InterfaceExample3 {
    public static void main(String[] args) {
        MyCommonClass myObject = new MyCommonClass();
        myObject.commonMethod(); // Call the commonMethod
    }
}


//        6. Create an interface with a default method and implement it in a class. Do not provide
//        implementation to the default method and call the method.
interface MyInterfaceWithDefault {
    default void defaultMethod() {
        System.out.println("Default method in MyInterfaceWithDefault");
    }

    void regularMethod();
}

class MyDefaultClassWithoutImplementation implements MyInterfaceWithDefault {
    @Override
    public void regularMethod() {
        System.out.println("Regular method in MyDefaultClassWithoutImplementation");
    }
}

class InterfaceExample4 {
    public static void main(String[] args) {
        MyDefaultClassWithoutImplementation myObject = new MyDefaultClassWithoutImplementation();

        // Calling the default method will use the default implementation
        myObject.defaultMethod();
        myObject.regularMethod();
    }
}


//       7. Create an interface and inherit it from the other interface.
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class InterfaceInheritanceExample {
    public static void main(String[] args) {
        ChildInterface childObject = new ChildInterface() {
            @Override
            public void parentMethod() {
                System.out.println("Implemented parentMethod in ChildInterface");
            }

            @Override
            public void childMethod() {
                System.out.println("Implemented childMethod");
            }
        };

        childObject.parentMethod();
        childObject.childMethod();
    }
}


