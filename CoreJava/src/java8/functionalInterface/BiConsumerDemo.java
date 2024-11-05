package java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        // List 1
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        // List 2
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        BiConsumer<List<Integer>,List<Integer>> compareList = (ls1, ls2)->{
            for(int i=0;i< ls1.size();i++){
                if(ls1.get(i).equals(ls2.get(i))){
                    System.out.println("Equal");
                }
            }
        };
        compareList.accept(list1,list2);
    }
}
