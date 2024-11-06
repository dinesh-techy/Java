package java8.methodReference;

import java.util.function.BiFunction;

public class InstanceMethodReference {
    public int add(Integer a, Integer b){
        return a+b;
    }
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> addition = new InstanceMethodReference()::add;
        System.out.println(addition.apply(1,2));
    }
}
