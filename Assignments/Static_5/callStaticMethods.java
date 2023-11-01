package Static_5;

//5. Call static methods in instance methods
public class callStaticMethods {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 5;
    int instanceVar2 = 15;

    public void callStaticMethodsInInstanceMethod() {
        System.out.println("Calling static methods in instance method:");
        printInstanceVariablesInStaticMethod(); // Calling a static method
    }

    public static void printInstanceVariablesInStaticMethod() {
        StaticInstanceExample example = new StaticInstanceExample();
        System.out.println("Instance Variable 1 in static method: " + example.instanceVar1);
        System.out.println("Instance Variable 2 in static method: " + example.instanceVar2);
    }

    public static void main(String[] args) {
        callStaticMethods example = new callStaticMethods();
        example.callStaticMethodsInInstanceMethod(); // Calling an instance method
    }
}
