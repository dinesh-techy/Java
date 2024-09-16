package oops.inheritance;

class A{
    void printA(){
        System.out.println("Class A");
    }
}
class B extends A{
    void printB(){
        System.out.println("Class A");
    }
}
public class SingleInheritance {

    public static void main(String[] args) {
        System.out.println("Single Inheritance");
        B obj = new B();
        obj.printB();
        obj.printA();
    }
}
