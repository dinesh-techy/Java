package java8.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> compareNum = (x, y)->{
            return x==y;
        };
        System.out.println(compareNum.test(2,2));
    }
}
