package generics;

// create a generics class
class Printer<T>{
    // variable of T type
    private T data;
    public Printer(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
}


public class GenericsClass {
    public static void main(String[] args) {
        // Integer
        Printer<Integer> printInteger = new Printer<>(10);
        System.out.println(printInteger.getData());
        // String
        Printer<String> printString = new Printer<>("Dinesh");
        System.out.println(printString.getData());
    }
}
