package oops.inheritance;

class Base {
    public void print_A() { System.out.println("Class A"); }
}

class Child1 extends Base {
    public void print_B() { System.out.println("Class B"); }
}

class Child2 extends Base {
    public void print_C() { System.out.println("Class C"); }
}

class Child3 extends Base {
    public void print_D() { System.out.println("Class D"); }
}

// Driver Class
public class HierarichalInheritance {
    public static void main(String[] args)
    {
        Child2 obj_B = new Child2();
        obj_B.print_A();
        obj_B.print_C();

        Child3 obj_C = new Child3();
        obj_C.print_A();
        obj_C.print_D();

        Child1 obj_D = new Child1();
        obj_D.print_A();
        obj_D.print_B();
    }
}