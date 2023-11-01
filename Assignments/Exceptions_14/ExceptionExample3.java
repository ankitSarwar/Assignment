package Exceptions_14;

//    3. Write a method which throws exception, Call that method in main class without try block
public class ExceptionExample3 {
    public static void main(String[] args) throws Exception {
        methodThatThrowsException();
    }

    static void methodThatThrowsException() throws Exception {
        throw new Exception("Custom Exception Message");
    }
}
