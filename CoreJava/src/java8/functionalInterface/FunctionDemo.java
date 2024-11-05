package java8.functionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,String> age = (x)->{
            return "Age is "+x;
        };
        System.out.println("Dinesh "+age.apply(24));
    }
}
