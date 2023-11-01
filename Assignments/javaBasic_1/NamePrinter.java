package javaBasic_1;

//6. Write a function to print your name and call the function from main method
public class NamePrinter {
    public void printMyName() {
        System.out.println("Your Name");
    }

    public static void main(String[] args) {
        NamePrinter printer = new NamePrinter();
        printer.printMyName(); // Calling the function to print your name
    }
}
