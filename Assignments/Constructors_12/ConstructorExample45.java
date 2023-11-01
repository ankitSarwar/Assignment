package Constructors_12;

//    4. Write constructors with return type int and String
//    5. Try to call the constructor multiple times with the same object

//  Ans ->  constructors do not have a return type, and you cannot call a constructor multiple times with the
//    same object.Constructors are responsible for initializing the object during its creation and are
//    not designed to be invoked after the object has been constructed.
class MyClass45 {
    int value;
    String text;

    MyClass45(int value, String text) {
        this.value = value;
        this.text = text;
    }
}

public class ConstructorExample45 {
    public static void main(String[] args) {
        MyClass45 obj = new MyClass45(42, "Hello"); // Constructor initializes the object
        // You cannot call the constructor again on the same object:
        // obj = new MyClass(10, "Hello Ankit"); // This is not allowed
    }
}

