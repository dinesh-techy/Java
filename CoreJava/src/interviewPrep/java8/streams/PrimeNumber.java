package interviewPrep.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {

    static boolean isPrime(Integer number){
        for(int i=2;i<number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Prime Number");
        Integer numbers[] = {10,23,12,4,6,1,0,22,12,41,123};
        List<Integer> primeNumber = Arrays.stream(numbers).filter(x-> isPrime(x)).collect(Collectors.toList());
        List<Integer> primeNumbersList = Arrays.stream(numbers).filter(x->{
            for(int i=2;i<x;i++){
                if (x%i==0){
                    return false;
                }
            }
            return true;
        }).collect(Collectors.toList());

        System.out.println(primeNumbersList);

        System.out.println(primeNumber);
    }
}
