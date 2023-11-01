package Operators_2;

//6. Program for relational operators (<,<==, >, >==)
public class RelationalOperators {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        boolean lessThan = num1 < num2;
        boolean lessThanOrEqual = num1 <= num2;
        boolean greaterThan = num1 > num2;
        boolean greaterThanOrEqual = num1 >= num2;

        System.out.println("Less Than: " + lessThan);
        System.out.println("Less Than or Equal: " + lessThanOrEqual);
        System.out.println("Greater Than: " + greaterThan);
        System.out.println("Greater Than or Equal: " + greaterThanOrEqual);
    }
}
