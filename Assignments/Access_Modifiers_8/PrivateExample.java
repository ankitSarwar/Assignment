package Access_Modifiers_8;
//    1. Create a class with PRIVATE fields, private method and a main method. Print the fields
//    in main method. Call the private method in main method.
//    Create a sub class and try to access the private fields and methods from sub class.

class ParentClass {
    private int privateField = 10;

    private void privateMethod() {
        System.out.println("Private Method in ParentClass");
    }

    public void accessPrivateMembers() {
        System.out.println("Accessing private field in ParentClass: " + privateField);
        privateMethod();
    }

    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        parent.accessPrivateMembers();
    }
}

class Subclass extends ParentClass {
    public void tryAccessingPrivateMembersFromSubclass() {
//        System.out.println(privateField); <-- error occur because
        // we cannot access private fields and methods from a subclass.

    }
}

public class PrivateExample {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        parent.accessPrivateMembers();

        Subclass sub = new Subclass();
        sub.tryAccessingPrivateMembersFromSubclass();
    }
}


//    2. Create a class with DEFAULT fields and methods. Access these fields and methods
//    from any other class in the same package

class DefaultAccessClass {
    int defaultField = 20;

    void defaultMethod() {
        System.out.println("Default Method");
    }
}

 class AccessInSamePackage {
    public static void main(String[] args) {
        DefaultAccessClass defaultObj = new DefaultAccessClass();
        System.out.println("Accessing default field: " + defaultObj.defaultField);
        defaultObj.defaultMethod();
    }
}

//    3. Create a class with PROTECTED fields and methods. Access these fields and methods
//    from any other class in the same package.
//    Also, Access the PROTECTED fields and methods from child class located in a different
//    package
 class ProtectedAccessClass {
    protected int protectedField = 30;

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
}






