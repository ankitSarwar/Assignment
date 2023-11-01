package Static_5;

//6. Print all the static, instance variables in main method
public class StaticExample {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 5;
    int instanceVar2 = 15;

    public static void main(String[] args) {
        System.out.println("Static Variable 1 in main method: " + staticVar1);
        System.out.println("Static Variable 2 in main method: " + staticVar2);

        StaticExample example = new StaticExample();
        System.out.println("Instance Variable 1 in main method: " + example.instanceVar1);
        System.out.println("Instance Variable 2 in main method: " + example.instanceVar2);
    }
}
