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

        // Convert [ "hello", "world" ] to uppercase using stream
        List<String> words = Arrays.asList("hello", "world");
        System.out.println(words.stream().map(word->word.toUpperCase()).collect(Collectors.toList()));

        // Double numbers in list [1, 2, 3, 4, 5]
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        System.out.println(nums.stream().map(num->num*2).collect(Collectors.toList()));

        // Find longest string in [ "abc", "abcd", "a" ]
        List<String> words1 = Arrays.asList("abc","abcd","a");
        System.out.println(words1.stream().max(Comparator.comparingInt(s->s.length())));

        // Sum numbers in [1, 2, 3, 4, 5]
        System.out.println(nums.stream().mapToInt(x->x).sum());

        // Find distinct numbers in [1, 2, 2, 3, 4, 4]
        System.out.println(nums.stream().collect(Collectors.toSet()));

        // Sort [4, 2, 7, 1, 3] ascending
        List<Integer> nums1 = Arrays.asList(4,2,7,1,3);
        System.out.println(nums1.stream().sorted().collect(Collectors.toList()));

        // Filter out even numbers from [1, 2, 3, 4, 5]
        System.out.println(nums.stream().filter(x->x%2==0).collect(Collectors.toList()));

        // Find square of each number in [1, 2, 3, 4]
        System.out.println(nums.stream().map(x->x*x).collect(Collectors.toList()));

        // Join [ "h", "e", "l", "l", "o" ] into a string
        List<String> letters = Arrays.asList("h","e","l","l","o");
        System.out.println(letters.stream().collect(Collectors.joining()));

        // Filter out strings containing "a" from ["hello", "cat", "dog", "tiger"]
        List<String> words2 = Arrays.asList("hello", "cat", "dog", "tiger");
        System.out.println(words2.stream().filter(word->!word.contains("a")).collect(Collectors.joining()));

        // Find the average of numbers [2, 4, 6, 8, 10]
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println(numbers.stream().mapToInt(x->x).average());
        System.out.println(numbers.stream().collect(Collectors.averagingInt(x->x)));

        // Find the longest string in ["apple", "banana", "cat"]
        List<String> fruits = Arrays.asList("apple", "banana", "cat");
        System.out.println(fruits.stream().max(Comparator.comparingInt(s->s.length())));
        System.out.println(fruits.stream().max((a, b) -> a.length() - b.length()).get());
        System.out.println(fruits.stream().sorted((a, b) -> b.length() - a.length()).findFirst().get());

        // Square each number in [1, 2, 3, 4] and print their sum
        System.out.println(nums.stream().map(num->num*num).mapToInt(x->x).sum()); // no need of map again
        System.out.println(nums.stream().mapToInt(num->num*num).sum());

        // Count how many strings in ["hello", "world", "", "java", ""] are empty
        List<String> words3 = Arrays.asList("hello", "world", "", "java", "");
        System.out.println(words3.stream().filter(s-> s.length()==0).count());
        System.out.println(words3.stream().filter(String::isEmpty).count());
        System.out.println(words3.stream().filter(s -> s.equals("")).count());

        // Find the first string that starts with "j" in ["hello", "world", "java", "apple", "just"]
        List<String> words4 = Arrays.asList("hello", "world", "java", "apple", "just");
        System.out.println(words4.stream().filter(word->word.startsWith("j")).findFirst().get());

        // Reverse the order of words in ["hello", "world", "java", "code"]


        // Find the total number of characters in all strings in ["hello", "world", "java"]
        System.out.println(words4.stream().map(s->s.length()).mapToInt(x->x).sum());
        System.out.println(words4.stream().collect(Collectors.summingInt(String::length)));
        System.out.println(words4.stream().mapToInt(String::length).sum());

        // Check if all strings in ["hello", "world", "java"] have more than 3 characters
        System.out.println(words4.stream().allMatch(s->s.length()>3));

        // Find the string that appears most frequently in ["hello", "world", "hello", "java", "hello"]
        List<String> words5 = Arrays.asList("hello", "world", "hello", "java", "hello");


        // Is the list ["a", "b", "c"] sorted alphabetically?
        List<String> letter = Arrays.asList("a", "b", "c");
        System.out.println(letter.stream().sorted().collect(Collectors.toList()).equals(letter));
    }
}
