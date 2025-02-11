package interviewPrep.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,3,4,6,0,9);
        List<Integer> list2 = Arrays.asList(12,45,2,5);

        List<Integer> mergedList = Stream.concat(list1.stream(),list2.stream()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(mergedList);
    }
}
