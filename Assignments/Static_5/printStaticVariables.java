package Static_5;

//3. Print static variables in Instance methods
public class printStaticVariables {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 5;
    int instanceVar2 = 15;

    public void printStaticVariablesInInstanceMethod() {
        System.out.println("Static Variable 1 in instance method: " + staticVar1);
        System.out.println("Static Variable 2 in instance method: " + staticVar2);
    }

    public static void main(String[] args) {
        printStaticVariables example = new printStaticVariables();
        example.printStaticVariablesInInstanceMethod();
    }
}
