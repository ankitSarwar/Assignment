package ThisAndSuper_11;

//    6. Use this() and super() in methods not in constructor
class MyClass6 {
    int value = 10;

    void displayValue() {
        System.out.println("Value: " + this.value); // Using this to access the instance member
    }

    void callParentMethod() {
        System.out.println("Calling parent method from child using super:");
        superMethod();
    }

    void superMethod() {
        System.out.println("Parent method");
    }
}

public class ThisAndSuperExample6 {
    public static void main(String[] args) {
        MyClass6 myObject = new MyClass6();
        myObject.displayValue();
        myObject.callParentMethod();
    }
}
