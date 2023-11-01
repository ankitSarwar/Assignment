package Operators_2;

//5. Programs on Logical AND,OR operator and Logical NOT
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean andResult = a && b; // Logical AND
        boolean orResult = a || b;  // Logical OR
        boolean notResult = !a;    // Logical NOT

        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);
    }
}
