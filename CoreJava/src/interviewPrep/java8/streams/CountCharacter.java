package interviewPrep.java8.streams;

// Count occurrence of a given character in a string using Stream API in Java
// https://www.geeksforgeeks.org/count-occurrence-of-a-given-character-in-a-string-using-stream-api-in-java/

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {
        String s = "total";
        Character targetCharacter = 't';

        // Count of the given character
        long characterCount = s.chars().filter(c -> c==targetCharacter).count();
        System.out.println(characterCount);

        // Count of each character
        String str = "advocate";
        Map<Character,Integer> countOfEachCharacter = new HashMap<>();
        str.chars().forEach(character ->{
            countOfEachCharacter.put((char) character,countOfEachCharacter.getOrDefault((char)character,0)+1);
        });
        System.out.println(countOfEachCharacter);

        // Count of each character using Collectors.groupingBy
        String str1 = "javadeveloper";
        Map<String,Long> charCount = Arrays.stream(str1.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);

        // Characters which are greater than 1
        String str2 = "javadeveloper";
        List<String> duplicates = Arrays.stream(str2.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(ch -> ch.getValue()>1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicates);

        // Characters which are greater than 1
        String str3 = "javadeveloper";
        List<String> uniqueElements = Arrays.stream(str3.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(ch -> ch.getValue()==1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(uniqueElements);

        // First non-repeat character from a string
        String str4 = "javadeveloper";
        String firstNonRepeatCharacter = Arrays.stream(str4.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(ch -> ch.getValue()==1)
                        .findFirst().get().getKey();
        System.out.println(firstNonRepeatCharacter);
    }
}
