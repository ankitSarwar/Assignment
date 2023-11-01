package Access_Modifiers_8;

//    4. Create a class with PUBLIC fields and methods.
//    Access the public methods and fields from any class in the same package or different
//    package
public class PublicInSamePackage {
    int a=10;
    int b=20;
    public static void main(String[] args) {

        //  Q 3 Access the PROTECTED fields and methods from any class in different package
        ProtectedAccessClass protectedObj = new ProtectedAccessClass();
        System.out.println("Accessing protected field: " + protectedObj.protectedField);
        protectedObj.protectedMethod();

        PublicInSamePackage publicExample=new PublicInSamePackage();
        System.out.println(" value of a is "+publicExample.a+" value of b is "+publicExample.b);

    }
}
