package ThisAndSuper_11;


//    3. Call constructor of the current class using this()
//    4. Call argument constructor of current class using this()
class MyClass3 {
    int value;

    MyClass3() {
        this(42); // Calls the constructor with an argument
    }

    MyClass3(int value) {
        this.value = value;
    }
}
public class ThisAndSuperExample3 {
    public static void main(String[] args) {
        MyClass3 myObject = new MyClass3();
        System.out.println("Value: " + myObject.value);
    }
}
