package interviewPrep.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    }
}
