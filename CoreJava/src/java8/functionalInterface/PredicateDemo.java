package java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Simple Predicate
        Predicate<Integer> positiveNumber = (i)->{
            if(i>0){
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println(positiveNumber.test(10));
        // Predicate chaining Greater than 10
        Predicate<Integer> greaterThanTen = (i)->{
            return  i>10;
        };
        System.out.println(positiveNumber.and(greaterThanTen).test(105));
        //Negate the predicate
        System.out.println(positiveNumber.and(greaterThanTen).negate().test(105));
        //OR
        System.out.println(positiveNumber.or(greaterThanTen).test(5));
    }
}
