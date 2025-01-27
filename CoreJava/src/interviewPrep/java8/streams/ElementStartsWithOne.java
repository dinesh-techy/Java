package interviewPrep.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementStartsWithOne {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,11,10,30,111};
        List<Integer> filteredList = Arrays.stream(numbers).boxed().filter(number->{
            return number.toString().startsWith("1");
        }).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
