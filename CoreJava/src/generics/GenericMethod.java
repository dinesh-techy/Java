package generics;

class Printer2{
    public <T> void printer(T data){
        System.out.println(data);
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        Printer2 printer2 = new Printer2();
        printer2.printer("Dinesh");
        printer2.printer(3.9);
    }
}
