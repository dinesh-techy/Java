package oops.inheritance;

class One{
    void printOne(){
        System.out.println("Class A");
    }
}
class Two extends One{
    void printTwo(){
        System.out.println("Class A");
    }
}
class Three extends Two{
    void printThree(){
        System.out.println("Class A");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("Multi Level Inheritance");
        Three obj = new Three();
        obj.printOne();
        obj.printTwo();
        obj.printThree();
    }
}
