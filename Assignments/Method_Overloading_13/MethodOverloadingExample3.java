package Method_Overloading_13;


//  3. Write two methods with the same name and same number of parameters of same type
//  and call from main method
class MethodOverloadingExample3 {
    void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    void printText(String text) {
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        MethodOverloadingExample3 example = new MethodOverloadingExample3();
        example.printMessage("Hello Ankit"); // Calls the first method
        example.printText("World");    // Calls the second method
    }
}


