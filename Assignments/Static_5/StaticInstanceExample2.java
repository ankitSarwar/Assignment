package Static_5;

//7. Call static methods and instance methods in main method
public class StaticInstanceExample2 {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 5;
    int instanceVar2 = 15;

    public void instanceMethod() {
        System.out.println("Inside instanceMethod");
    }

    public static void staticMethod() {
        System.out.println("Inside staticMethod");
    }

    public static void main(String[] args) {
        System.out.println("Calling static method:");
        staticMethod(); // Calling a static method

        StaticInstanceExample2 example = new StaticInstanceExample2();
        System.out.println("Calling instance method:");
        example.instanceMethod(); // Calling an instance method
    }
}
