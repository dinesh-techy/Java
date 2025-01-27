package interviewPrep.java8.streams;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.geeksforgeeks.org/how-to-find-duplicate-elements-in-a-stream-in-java/
//How to find duplicate elements in a Stream in Java

public class FindDuplicateElements {

    public static void main(String[] args) {
        Supplier<Stream<Integer>> numbersList = ()->Stream.of(1,1,3,5,6,6,7,2,1,7);
        // Using Set
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> duplicateElementList = numbersList.get().filter(element-> {
            return !uniqueElements.add(element); // add returns false if element is already present in the Set
        }).distinct().collect(Collectors.toList());
        System.out.println(duplicateElementList);

        // Using Collections.frequency
        List<Integer> duplicateElements = numbersList.get().collect(Collectors.toList()).stream().filter(element-> {
            return Collections.frequency(numbersList.get().collect(Collectors.toList()), element) > 1;
        }).distinct().collect(Collectors.toList());
        System.out.println(duplicateElements);
    }
}
