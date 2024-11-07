package java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        System.out.println("Stream API....");
        // Array List
        List<List<String>> nameList = Arrays.asList(Arrays.asList("orange","apple","pineapple","orange"),Arrays.asList("carrot","onion","Beetroot","carrot"),Arrays.asList("spinache","lettuce","corrainder","corriander"));
        // SET data structure to hold unique data
        Set<String> uniqueData = new HashSet<>();

        // The following code depicts the usage of various Intermediate Operation\
        List<String> result1 = nameList.stream().flatMap(List::stream) // Flattens list of list into single list
                .filter(s->s.startsWith("o")) // Filters the element starts with O
                .map(String::toUpperCase) // Transform each element into upper case
                .distinct() // Removes duplicate elements
                .sorted() // Sort elements
                .peek(s -> uniqueData.add(s)) // Perform an action (add to set) on each element
                .collect(Collectors.toList()); // Collect the final result into result1
        uniqueData.forEach(System.out::println);
        result1.forEach(System.out::println);

        // The following code depicts the usage of various Terminal Operation
        List<String> names = Arrays.asList("Dinesh","Dhanush","Sivashankar","Ajaye");
        names.forEach(System.out::println); // forEach: Print each name

        List<String> nameWithD = names.stream().filter(s->s.startsWith("D")).collect(Collectors.toList());
        nameWithD.forEach(System.out::print);

        System.out.println("Count of names..."+names.stream().count()); // count: Count the number of names
        System.out.println("Find first..."+names.stream().findFirst()); // findFirst: Find the first name

        System.out.println(nameWithD.stream().allMatch(s->s.startsWith("D"))); // allMatch: Check if all names start with 'D'

        System.out.println(names.stream().anyMatch(x -> x.startsWith("D"))); // anyMatch: Check if any name starts with 'D'


    }
}
