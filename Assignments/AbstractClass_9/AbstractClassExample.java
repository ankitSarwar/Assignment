package AbstractClass_9;

//1. Create an abstract class with abstract and non-abstract method
abstract class MyAbstractClass {
    // Abstract method (no implementation)
    public abstract void abstractMethod();

    // Non-abstract method with an implementation
    public void nonAbstractMethod() {
        System.out.println("Non-abstract method in abstract class");
    }
}

//    2. Create a sub class for an abstract class. Create an object in the child class for the
//    abstract class and access the non-abstract methods
class Subclass extends MyAbstractClass {
    // Implement the abstract method from the abstract class
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstractMethod in Subclass");
    }

    // Additional non-abstract method
    public void additionalMethod() {
        System.out.println("Additional method in Subclass");
    }
}


//3. Create an instance for the child class in child class and call abstract methods
// 4. Create an instance for the child class in child class and call non-abstract methods
public class AbstractClassExample {
    public static void main(String[] args) {
        Subclass sub = new Subclass();

        // Call the implemented abstract method
        sub.abstractMethod();


        // Call non-abstract methods from the abstract class and the subclass
        sub.nonAbstractMethod(); // From the abstract class
        sub.additionalMethod(); // From the subclass
    }
}

