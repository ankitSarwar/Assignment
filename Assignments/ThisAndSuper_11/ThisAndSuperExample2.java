package ThisAndSuper_11;

//    2. Print the fields/instance members of the parent class using super
class ParentClass {
    int parentField = 10;
}

class ChildClass extends ParentClass {
    void printParentField() {
        System.out.println("Using super: " + super.parentField);
    }
}
public class ThisAndSuperExample2 {
    public static void main(String[] args) {
        ChildClass childObject = new ChildClass();
        childObject.printParentField();
    }
}
