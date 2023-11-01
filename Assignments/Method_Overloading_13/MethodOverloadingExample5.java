package Method_Overloading_13;

//    5. Write two methods with the same name, number of parameters and data type but
//    different return Type
class MethodOverloadingExample5 {
    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample5 example = new MethodOverloadingExample5();
        int sum = example.calculate(5, 10);        // Calls the first method, which returns an int
        double product = example.calculate(3.0, 2.5); // Calls the second method, which returns a double
    }
}

