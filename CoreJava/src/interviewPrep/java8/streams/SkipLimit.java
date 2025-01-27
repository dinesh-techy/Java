package interviewPrep.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimit {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> skipLimitList = Arrays.stream(numbers).boxed().skip(1).limit(8).collect(Collectors.toList());
        System.out.println(skipLimitList);
    }
}
