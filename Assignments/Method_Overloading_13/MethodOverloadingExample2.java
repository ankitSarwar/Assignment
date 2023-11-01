package Method_Overloading_13;

//    2. Write two methods with the same name but different number of parameters of different
//    data type and call the methods from main method
class MethodOverloadingExample2 {
    void printNumber(int num) {
        System.out.println("Number: " + num);
    }

    void printNumber(double num) {
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        MethodOverloadingExample2 example = new MethodOverloadingExample2();
        example.printNumber(10);       // Calls the first method
        example.printNumber(3.14);     // Calls the second method
    }
}
