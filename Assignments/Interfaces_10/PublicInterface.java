package Interfaces_10;

//    8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
//    Implement this interface to some class and print the values of the interface fields and
//    call the interface methods
public interface PublicInterface {
    int PUBLIC_FIELD = 42; // Public field with a value

    void publicMethod();
}
class PublicClass implements PublicInterface {
    @Override
    public void publicMethod() {
        System.out.println("Public method in PublicClass");
        System.out.println("Value from interface field: " + PUBLIC_FIELD);
    }
}

class InterfaceExample5 {
    public static void main(String[] args) {
        PublicClass myObject = new PublicClass();
        myObject.publicMethod(); // Call the public method and access the public field
    }
}


//    9. Create a PRIVATE or PROTECTED interface and print the values as above scenario

//  Ans ->  but it's not possible to create a private or protected interface in Java. Interfaces in Java are
//    always implicitly public, and the fields defined within an interface are always public,
//    static, and final.Private and protected access modifiers are not allowed for interface members.
//
//    In Java, you can only create public interfaces with public, static, final fields.
//    If you need to restrict access to certain members, you can use appropriate naming conventions and
//    documentation to indicate their intended usage and accessibility.

//----------------------------------------------------------------------------------------------------

//    10. Create an interface with private, public and protected fields.

//Ans -> In Java, it's not possible to create an interface with private or protected fields.
//        Interfaces are limited to having only public, static, and final fields. Fields in an
//        interface are implicitly public, static, and final, and you cannot change their access modifiers.
//
//        If you need private or protected fields, you should consider using abstract classes instead of
//        interfaces. Abstract classes allow you to define fields with different access modifiers, including
//        private and protected, and provide more flexibility in terms of member accessibility.


