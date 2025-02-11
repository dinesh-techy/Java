package interviewPrep.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,62,12,41,10);
        List<Integer> list2 = Arrays.asList(1,2,10);

        List<Integer> mergedList = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(mergedList);
    }
}
