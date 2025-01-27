package interviewPrep.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestElement {

    public static void main(String[] args) {
        int [] numberArray = {10,4,2,1,30,12};

        List<Integer> secongLargestElement = Arrays.stream(numberArray)
                .boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(secongLargestElement);

        // Using skip
        List<Integer> secongLargestElement1 = Arrays.stream(numberArray)
                .boxed().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList());
        System.out.println(secongLargestElement1);

        // Using skip
        Integer secongLargestElement3 = Arrays.stream(numberArray)
                .boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secongLargestElement3);
    }
}
