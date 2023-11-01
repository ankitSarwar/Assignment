package Static_5;

//2. Print instance variables in static methods
public class PrintInstanceVariables {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 5;
    int instanceVar2 = 15;

    public static void printInstanceVariablesInStaticMethod() {
        // You cannot access instance variables directly in a static method.
        // To access them, you need an instance of the class.
        // Creating an instance to access instance variables:
        StaticInstanceExample example = new StaticInstanceExample();
        System.out.println("Instance Variable 1 in static method: " + example.instanceVar1);
        System.out.println("Instance Variable 2 in static method: " + example.instanceVar2);
    }

    public static void main(String[] args) {
        printInstanceVariablesInStaticMethod();
    }
}
