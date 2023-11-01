package Static_5;

//4. Call instance methods in static methods
public class StaticInstanceExample1 {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 5;
    int instanceVar2 = 15;

    public static void callInstanceMethodsInStaticMethod() {
        StaticInstanceExample1 example = new StaticInstanceExample1();
        example.printStaticVariablesInInstanceMethod(); // Calling an instance method
    }

    public void printStaticVariablesInInstanceMethod() {
        System.out.println("Static Variable 1 in instance method: " + staticVar1);
        System.out.println("Static Variable 2 in instance method: " + staticVar2);
    }

    public static void main(String[] args) {
        callInstanceMethodsInStaticMethod();
    }
}
