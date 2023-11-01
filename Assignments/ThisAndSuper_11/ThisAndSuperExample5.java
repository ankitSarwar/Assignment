package ThisAndSuper_11;

//    5. Call constructor of the parent class using super()
class ParentClass5 {
    ParentClass5() {
        System.out.println("ParentClass constructor");
    }
}

class ChildClass5 extends ParentClass {
    ChildClass5() {
        super(); // Calls the constructor of the parent class
        System.out.println("ChildClass constructor");
    }
}

public class ThisAndSuperExample5 {
    public static void main(String[] args) {
        ChildClass5 childObject = new ChildClass5();
    }
}
