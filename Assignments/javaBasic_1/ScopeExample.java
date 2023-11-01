package javaBasic_1;

//5. Define the local and Global variables with the same name and print both variables and
//understand the scope of the variables
public class ScopeExample {
    int globalVariable = 10; // Global variable

    public void myMethod() {
        int localVar = 5; // Local variable with the same name as the global variable
        System.out.println("Local variable: " + localVar);
        System.out.println("Global variable: " + globalVariable);
    }

    public static void main(String[] args) {
        ScopeExample example = new ScopeExample();
        example.myMethod();
        System.out.println("Global variable from main: " + example.globalVariable);
    }
}
