package oops.polymorphism;

class Parent{
    void classType(){
        System.out.println("Parents Base class");
    }
}

public class MethodOverriding extends Parent {
    @Override
    void classType() {
        System.out.println("Child class..");
    }

    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.classType();
    }
}
