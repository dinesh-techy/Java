package java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> printNumber = (Integer x)->{
            System.out.println(x);
        };
        printNumber.accept(10);

        // Passing an Array list
        Consumer<List<Integer>> printArrayList = (list)->{
            list.stream().forEach(x->System.out.println(x));
        };
        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(30);
        printArrayList.accept(numList);
        // usage of and then
        Consumer<List<Integer>> modifyArrayList = new Consumer<List<Integer>>() {
            @Override
            public void accept(List<Integer> integers) {
                for (int i=0;i<numList.size();i++){
                    numList.set(i, numList.get(i)*2);
                }
            }
        };
        modifyArrayList.andThen(printArrayList).accept(numList);
    }
}
