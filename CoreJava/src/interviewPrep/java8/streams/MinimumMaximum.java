package interviewPrep.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumMaximum {
    public static void main(String[] args) {
        int [] numbers = {10,10,111,12,40,1,41,111,222};

        int minimumNumber = Arrays.stream(numbers).boxed().min(Integer::min).get();
        int maximumNumber = Arrays.stream(numbers).boxed().max(Integer::max).get();
        System.out.println("Minimum Number = " + minimumNumber);
        System.out.println("Maximum Number = " + maximumNumber);

        //Count of numbers
        long countOfNumbers = Arrays.stream(numbers).boxed().count();
        System.out.println("Count of Numbers = " + countOfNumbers);

        // Unique Elements
        List<Integer> distinceElements = Arrays.stream(numbers).boxed().distinct().collect(Collectors.toList());
        System.out.println("Distinct Elements = " + distinceElements);
    }
}
