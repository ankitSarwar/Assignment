package ThisAndSuper_11;

//    1. Print the fields/instance members of the current class using this and without using object
class MyClass {
    int myField = 42;

    void printField() {
        System.out.println("Using this: " + this.myField);
        System.out.println("Without using object: " + myField);
    }
}

public class ThisAndSuperExample {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.printField();
    }
}






