package Method_Overloading_13;

//    4. Write two methods with the same name and same number of parameters of different
//    type and call from main method
class MethodOverloadingExample4 {
    void printValue(int num) {
        System.out.println("Integer Value: " + num);
    }

    void printValue(String text) {
        System.out.println("String Value: " + text);
    }

    public static void main(String[] args) {
        MethodOverloadingExample4 example = new MethodOverloadingExample4();
        example.printValue(42);       // Calls the first method with an int parameter
        example.printValue("Hello");  // Calls the second method with a String parameter
    }
}

