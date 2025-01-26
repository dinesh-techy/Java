package java8.streams.interview;

// Count occurrence of a given character in a string using Stream API in Java
// https://www.geeksforgeeks.org/count-occurrence-of-a-given-character-in-a-string-using-stream-api-in-java/

import java.util.HashMap;
import java.util.Map;
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
    }
}
