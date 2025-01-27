package interviewPrep.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestStringFromArray {
    public static void main(String[] args) {
        String [] names = {"Dinesh","Ajaye","Akila","Dhanush","Vijay","Sivashankar"};

        // Find largest String
        String longestString = Arrays.stream(names).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println(longestString);

        // Find secondLargest String - Optimized Approach
        String secondLargestName1 =Arrays.stream(names).sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(secondLargestName1);

    }
}
