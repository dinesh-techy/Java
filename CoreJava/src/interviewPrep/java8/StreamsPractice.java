package interviewPrep.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
//        Java program to calculate the average of a list of integers using streams.
        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        Integer average = (int) numList.stream().mapToInt(x->x).average().orElse(0.0);
        System.out.println("Average of numList "+average);

//        Java program to convert a list of strings to uppercase or lowercase using streams
        List<String> nameList = Arrays.asList("dinesh","sathish","dhanush");
        List<String> upperList = nameList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperList);

//        Java program to calculate the sum of all even, odd numbers in a list using streams.
        List<Integer> numList2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sumOfOdd = numList2.stream().filter(x->x%2!=0).mapToInt(x->x).sum();
        Integer sumOfEven = numList2.stream().filter(x->x%2==0).mapToInt(x->x).sum();
        System.out.println("Sum of odd..."+sumOfOdd+"...Sum of even..."+sumOfEven);

//        Java program to remove all duplicate elements from a list using streams
        List<String> countryList = Arrays.asList("India","China","USA","India","UK","Britain","China");
        Set<String> uniqueCountryList = countryList.stream().collect(Collectors.toSet());
        System.out.println("Unique Country List "+uniqueCountryList);

//        Java program to count the number of strings in a list that start with a specific letter using streams.
        List<String> countryList2 = Arrays.asList("UAE","India","China","USA","India","UK","Britain","China");
        Integer specificCountryList = (int) countryList2.stream().filter(x->x.startsWith("U")).count();
        System.out.println("Country starting with character U "+specificCountryList);

//        Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> nameList2 = Arrays.asList("dinesh","sathish","dhanush","ajaye","mithun");
        List<String> ascNameList = nameList2.stream().sorted().toList();
        List<String> descNameList = nameList2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Ascending Order:::"+ascNameList);
        System.out.println("Descending Order:::"+descNameList);

//        Java program to find the maximum and minimum values in a list of integers using streams
        List<Integer> numList3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer maxValue = numList3.stream().max((a,b)->a.compareTo(b)).orElse(0);
        Integer minValue = numList3.stream().min((a,b)->a.compareTo(b)).orElse(0);
        System.out.println("Maximum number of list " + maxValue);
        System.out.println("Minimum number of list " + minValue);

//        Java program to find the second smallest and largest elements in a list of integers using streams.
        List<Integer> numList4 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer secondSmallest = numList4.stream().sorted().skip(1).findFirst().orElse(Integer.MIN_VALUE);
        Integer secondLargest = numList4.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(Integer.MIN_VALUE);
        System.out.println("Second largest number " + secondLargest);
        System.out.println("Second smallest number " + secondSmallest);

//        Find the first element of a Stream in Java
        List<String> names = Arrays.asList("Dinesh","D","Mithun");
        System.out.println(names.stream().findFirst());
        System.out.println(names.stream().findFirst());

//        Find duplicate elements in a Stream in Java
        List<Integer> numbersList = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
    // USING SET
        // Set to hold the unique elements
        Set<Integer> uniqueNumbers = new HashSet<>();
        // .add() will return false if the element is already present in the set
        List<Integer> duplicates = numbersList.stream().filter(x->!uniqueNumbers.add(x)).collect(Collectors.toList());
        System.out.println("Unique Numbers::"+uniqueNumbers);
        System.out.println("Duplicate Numbers::"+duplicates);
    //  USING COLLECTIONS.FREQUENCY
        List<Integer> duplicateFreq = numbersList.stream().filter(x ->
                // Check the frequency of each element in stream
                Collections.frequency(numbersList,x)>1).toList();
        System.out.println("Duplicate Numbers = " + Arrays.toString(args));

//        Count occurrence of a given character in a string using Stream API in Java
        String name= "harshath Shanthilal Mehta";
        // The Java Stream API is designed for collections and doesn't have a direct .streams() method for String. However, the .chars() method effectively serves a similar purpose for Strings by returning an IntStream.
        long countOfH = name.chars().filter(x -> x=='h').count();
        System.out.println("Count of h " + countOfH);

//      Program to convert a Map to a Stream in Java
        Map<Integer,String> studentList = new HashMap<>();
        studentList.put(1,"Dinesh");
        studentList.put(2,"Ajaye");
        studentList.put(3,"Akshay");

        // Convert into stream
        Stream<Map.Entry<Integer, String>> studentListStream = studentList.entrySet().stream();
        System.out.println(Arrays.toString(studentListStream.toArray()));
        // Get only the keys
        List<Integer> getHashMapKeys = studentList.keySet().stream().collect(Collectors.toList());
        List<String> getHashMapValues = studentList.values().stream().collect(Collectors.toList());
        System.out.println("HashMap keys..."+getHashMapValues);
        System.out.println("HashMap values..."+getHashMapValues);
    }
}
