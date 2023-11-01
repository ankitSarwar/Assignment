package Constructors_12;

//    2. Call the constructors(both default and argument constructors) of super class from a child
//    class
class ParentClass {
    ParentClass() {
        System.out.println("ParentClass default constructor");
    }

    ParentClass(int value) {
        System.out.println("ParentClass one-argument constructor with value: " + value);
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        super();  // Calling the default constructor of the parent class
        System.out.println("ChildClass default constructor");
    }

    ChildClass(int value) {
        super(value);  // Calling the one-argument constructor of the parent class
        System.out.println("ChildClass one-argument constructor with value: " + value);
    }
}
public class ConstructorExample2 {
    public static void main(String[] args) {
        ChildClass child1 = new ChildClass();           // Calling default constructors
        ChildClass child2 = new ChildClass(42);         // Calling one-argument constructors
    }
}
