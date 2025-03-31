package interviewPrep.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaExpressionPractice {

    public static void main(String[] args) {
        // Lambda Expression to find sum of twoNumbers
        BiFunction<Integer,Integer,Integer> sumOfTwoNums = (a,b)->{
            return a+b;
        };
        System.out.println("Sum of two Numbers::"+sumOfTwoNums.apply(1,2));

        // List of String to upperCase and LowerCase
        List<String> stringList = new ArrayList<>(Arrays.asList("apPle","maNgo","oRAnge"));
        List<String> upperCaseList = stringList.stream().map(string->{
            return string.toUpperCase();
        }).collect(Collectors.toList());
        List<String> lowerCaseList = stringList.stream().map(string->{
            return string.toLowerCase();
        }).collect(Collectors.toList());
        System.out.println("UpperCase List..."+upperCaseList);
        System.out.println("LowerCase List..."+lowerCaseList);

        //Filter even numbers from a list
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,11,13,2,3,45,6,6,7,8,8,10));
        numbers.stream().filter(num->{
            return num%2==0;
        }).forEach(System.out::print);

        // Check if a given string isEmpty
        Predicate<String> checkEmptyString = (input->{
            return input.isEmpty();
        });
        System.out.println("\nCheck emptyString.."+checkEmptyString.test(""));

        // Find the average of a list of doubles
        List<Integer> doubleList = new ArrayList<>(Arrays.asList(103,12,422));
        System.out.println(doubleList.stream().reduce((a,b)-> a+b).get()/doubleList.stream().count());
        System.out.println(doubleList.stream().mapToInt(Integer::intValue).average().getAsDouble());

        // remove duplicates from a list of integers
        List<Integer> duplicateList = new ArrayList<>(Arrays.asList(1,1,1,3,2,3,4,5,5,3));
        List<Integer> uniqueList = duplicateList.stream().distinct().toList();
        System.out.println("Remove Dups from list..."+uniqueList);

        // Sort a list of strings in alphabetical order
        List<String> stringList1 = Arrays.asList("Dinesh","Sivashankar","Dhanush");
        List<String> ascSort  = stringList1.stream().sorted().toList();
        List<String> descSort = stringList1.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Ascending Sort..."+ascSort);
        System.out.println("Descending Sort..."+descSort);

        // calculate the sum of all Even numbers
        List<Integer> numberList = Arrays.asList(1,2,4,5,6,7,8,9,10,12,12,13);
        System.out.println("Sum of all Even numbers..."+numberList.stream().filter(num->num%2==0).mapToInt(Integer::intValue).sum());

        // calculate the factorial of a given number
        Function<Integer,Integer> factorial = (a->{
            int result=1;
            for(;a>=1;a--){
                result*=a;
            }
            return result;
        });
        System.out.println(factorial.apply(5));

        // Concatenate two Strings
        BiFunction<String,String,String> stringConcatenate = (string1,string2)->{
            return string1.concat(string2);
        };
        System.out.println("String Concatenate..."+stringConcatenate.apply("Dinesh","Gayathri"));

        // find the maximum and minimum values in a list of integers
        List<Integer> numberList1 = Arrays.asList(1,2,3,12121,12);
        Integer maximumNumber=numberList1.stream().mapToInt(Integer::intValue).max().getAsInt();
        Integer minimumNumber = numberList1.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Maximum Number..."+maximumNumber+"..Minimum Number"+minimumNumber);

        // multiply and sum all elements in a list of integers
        List<Integer> numberList2= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer multiplication = numberList2.stream().reduce(1,(a,b)->a*b);
        Integer sum = numberList2.stream().reduce(1,(a,b)->a+b);
        System.out.println("Sum of all values..."+sum);
        System.out.println("Multiplication of all values..."+multiplication);

        // Takes a list of numbers and returns the square of each number
        List<Integer> numberList3= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> squareOfEachNumber = numberList3.stream().map(a->a*a).collect(Collectors.toList());
        System.out.println("Square of eachNumber = " + squareOfEachNumber);

        // To check if a given string is a palindrome
        Predicate<String> palindromeString = (str->{
            return str.equals(new StringBuilder(str).reverse());
        });
        System.out.println("Palindrome String...."+palindromeString.test("madam"));

        // Sort String based on length
        List<String> nameList = Arrays.asList("Dinesh","Ashik","AK","Siva","Ajay");
        List<String> nameListLengthSorted = nameList.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println("Sort string based on length..."+nameListLengthSorted);

        // find the maximum and minimum string in a list of strings
        List<String> nameList1 = Arrays.asList("Dinesh","Ashik","AK","Siva","Ajay","DhanushAdhavam");
        String maximumLengthName = nameList1.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList().get(0);
        String minimumLengthName = nameList1.stream().sorted(Comparator.comparingInt(String::length)).toList().get(0);
        System.out.println("Max length name..."+maximumLengthName+"...Minimum length name..."+minimumLengthName);

        //convert a list of strings to uppercase
        List<String> citiesList = Arrays.asList("chennai","trichy","hyderabad","amaravathi","mumbai","delhi");
        List<String> upperCaseCitiesList = citiesList.stream().map(city->city.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseCitiesList);

        // filter out all strings from a list that have a length greater than 5 characters
        List<String> nameList3 = Arrays.asList("Ak","Dinesh","Ajay","Dhanush","Siva");
        List<String> greaterFive = nameList3.stream().filter(str->str.length()>5).toList();
        System.out.println("Greater than 5 char..."+greaterFive);

        // find the prime numbers in a list of integers
        List<Integer> numberList4 = Arrays.asList(1,2,3,4,5);
        List<Integer> primeNumberList = numberList4.stream().filter(num->{
            for(int i=2;i<num;i++){
                if(num%i==0 && i!=num){
                    return false;
                }
            }
            return true;
        }).toList();
        System.out.println("Prime Number List..."+primeNumberList);

        // count the number of words in a given sentence (words are separated by spaces)
        String inputString = "Dog is a very good animal";
        Function<String,Integer> numberOfWords = (str->{
            return Math.toIntExact(Arrays.stream(str.split(" ")).count());
        });
        System.out.println("Number of words..."+numberOfWords.apply(inputString));

        // convert a list of strings to uppercase if the string length is even and to lowercase if the string length is odd
        List<String> nameList4 = Arrays.asList("Ak","Dunaa","Dinesh","Ajay","Dhanush","Siva");
        List<String> modifiedNameList =nameList4.stream().map(str->{
            if(str.length()%2==0){
                return str.toUpperCase();
            }
            else{
                return str.toLowerCase();
            }
        }).toList();
        System.out.println("Modified name list..."+modifiedNameList);

        //  remove the vowels from a list of strings
        String vowelString = "Dinesh is a good boy";
        Function<String, String> removeVowels = str -> str.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Remove vowels..."+removeVowels.apply(vowelString));

        // sum of squares of all numbers from 1 to 10
        Integer sumOfSquare = IntStream.rangeClosed(1,10).map(num -> num*num).sum();
        System.out.println("Sum of Square "+sumOfSquare);

        // find the difference between the maximum and minimum values in a list of doubles
        List<Double> doublesList = Arrays.asList(10.0,10.2,10.3,11.0,22.4);
        Function<List<Double>,Double> findDiff = (list->{
            Double min = list.stream().mapToDouble(Double::floatValue).min().getAsDouble();
            Double max = list.stream().mapToDouble(Double::floatValue).max().getAsDouble();
            return max-min;
        });
        System.out.println("Diff b/w max and min..."+findDiff.apply(doublesList));

        // Find the number of words that start with a vowel in a list of strings
        List<String> nameList5 = Arrays.asList("Ak","Dunaa","Dinesh","Ajay","Dhanush","Siva","Elango");
        System.out.println(nameList5.stream().filter(name -> {
            char firstChar = Character.toLowerCase(name.charAt(0));
            return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
        }).count());

        // Find first non-empty string in a list of strings
        List<String> stringList2 = Arrays.asList("","","Dragon","Don","");
        System.out.println(stringList2.stream().filter(s ->!s.isEmpty()).findFirst().get());

        //  find the longest palindrome string in a list of strings
        List<String> palindromeList = Arrays.asList("abba","madam","civic","refer");
        String longestPalindrome = palindromeList.stream().filter(s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())).max((s1, s2) -> s1.length() - s2.length()).orElse("No palindrome found");
        System.out.println(longestPalindrome);

        // All string starts with upperCase
        List<String> fruits = Arrays.asList("apple","Orange","Pineapple","Mango");
        System.out.println("All Starts with UpperCase::"+fruits.stream().allMatch(fruit -> Character.isUpperCase(fruit.charAt(0))));

        // Largest even number in list
        List<Integer> numberList5 = Arrays.asList(1,2,3,4,56,7,8,100);
        System.out.println("Largest even number "+numberList5.stream().filter(number->number%2==0).max(Integer::compareTo).get());
    }
}
