package Method_Overloading_13;

//    1. Write two methods with the same name but different number of parameters of same type
//    and call the methods from main method
class MethodOverloadingExample {
    void printNumber(int num) {
        System.out.println("Number: " + num);
    }

    void printNumber(int num1, int num2) {
        System.out.println("Numbers: " + num1 + ", " + num2);
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();
        example.printNumber(10);       // Calls the first method
        example.printNumber(20, 30);   // Calls the second method
    }
}



