package Inheritance_7;

class A {
    int varA;

    A() {
        varA = 10;
    }

    void methodA1() {
        System.out.println("Method A1 from class A");
    }

    void methodA2() {
        System.out.println("Method A2 from class A");
    }

    void commonMethod() {
        System.out.println("Common method in class A");
    }
}

class B extends A {
    int varB;

    B() {
        varB = 20;
    }

    void methodB1() {
        System.out.println("Method B1 from class B");
    }

    void methodB2() {
        System.out.println("Method B2 from class B");
    }

    @Override
    void commonMethod() {
        System.out.println("Overridden common method in class B");
    }
}

class C extends B {
    int varC;

    C() {
        varC = 30;
    }

    void methodC1() {
        System.out.println("Method C1 from class C");
    }

    void methodC2() {
        System.out.println("Method C2 from class C");
    }

    @Override
    void commonMethod() {
        System.out.println("Overridden common method in class C");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Calling methods of class A:");
        a.methodA1();
        a.methodA2();
        a.commonMethod();
        System.out.println("VarA in A: " + a.varA);

        System.out.println("\nCalling methods of class B:");
        b.methodA1(); // Inherited from A
        b.methodB1();
        b.commonMethod(); // Overridden in B
        System.out.println("VarA in B: " + b.varA);
        System.out.println("VarB in B: " + b.varB);

        System.out.println("\nCalling methods of class C:");
        c.methodA1(); // Inherited from A
        c.methodC1();
        c.commonMethod(); // Overridden in C
        System.out.println("VarA in C: " + c.varA);
        System.out.println("VarB in C: " + c.varB);
        System.out.println("VarC in C: " + c.varC);
    }
}
