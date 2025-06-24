package java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MasterStreams {
    public static void main(String[] args) {
        System.out.println("******* BASIC STREAMS *********");
        // Basic Streams

        // Convert a List<String> to uppercase using Streams
        List<String> names = new ArrayList<>(Arrays.asList("ajaye","","  ","sivashankar","dinesh","sivashankar","ajaye","akila","Dhanush"));
        names = names.stream().map(String::toUpperCase).toList();
        System.out.println("Convert a List<String> to uppercase using Streams..."+names);

        // Convert a List<Integer> to a comma-separated String.
        String unifiedString  = names.stream().collect(Collectors.joining(","));
        System.out.println("Convert a List<Integer> to a comma-separated String...."+unifiedString);

        // Count the number of even numbers in a List<Integer>
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Integer evenCount = (int) numbers.stream().filter(num->num%2==0).count();
        System.out.println("Count the number of even numbers in a List<Integer>..."+evenCount);

        // Filter names starting with a particular letter from a list.
        List<String> filteredNames = names.stream().filter(name->name.startsWith("A")).toList();
        System.out.println("Filter names starting with a particular letter from a list..."+filteredNames);

        // Remove duplicate elements from a list using streams.
        List<String> uniqueNames = names.stream().distinct().toList(); // List<String> uniqueNames = names.stream().collect(Collectors.toSet()).stream().toList();
        System.out.println("Remove duplicate elements from a list using streams...."+uniqueNames);

        // Given a list of strings, return only those which are not empty.
        List<String> nonEmptyString = names.stream().filter(str -> !str.isBlank()).toList();
        System.out.println("Given a list of strings, return only those which are not empty...."+nonEmptyString);

        // Sort a list of strings by length using streams.
        List<String> sortedNames = names.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println("Sort a list of strings by length using streams..."+sortedNames);

        // Convert a List<String> to a Set<String> using streams.
        Set<String> setNames = names.stream().collect(Collectors.toSet());
        System.out.println("Convert a List<String> to a Set<String> using streams."+setNames);

        // Flatten a list of lists: List<List<Integer>> to List<Integer>.
        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(new ArrayList<>(Arrays.asList(2,34,12,12)));
        listOfList.add(new ArrayList<>(Arrays.asList(12,24,142,121)));
        List<Integer> flattenedList = listOfList.stream().flatMap(List::stream).toList();
        System.out.println("Flatten a list of lists: List<List<Integer>> to List<Integer>...."+flattenedList);

        // Find the average of a list of integers using stream.
        Double average = flattenedList.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        System.out.println("Find the average of a list of integers using stream..."+average);

        //  Intermediate Operations Practice

        // Demonstrate use of filter(), map(), distinct() in one chain.
        List<String> nameList = new ArrayList<>(Arrays.asList("akila ","ben"," don","dhanush","keerthana"," sivashankar ","ajaye","akila"));
        List<String> intermediateList = nameList.stream().filter(s->s.length()>3).map(String::trim).distinct().toList();
        System.out.println("Demonstrate use of filter(), map(), distinct() in one chain..."+intermediateList);

        // Convert a list of strings to their lengths.
        List<Integer> nameListLength = nameList.stream().map(name-> name.length()).toList();
        System.out.println("Convert a list of strings to their lengths...."+nameListLength);

        // Given a list of String, return strings longer than 5 characters in reverse alphabetical order.
        List<String> filteredReverseOrder = nameList.stream().filter(str->str.length()>5).sorted(Comparator.reverseOrder()).toList();
        System.out.println("Given a list of String, return strings longer than 5 characters in reverse alphabetical order....."+filteredReverseOrder);

        // Given a list of integers, multiply each odd number by 2 and skip even numbers.
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> multiplyList = numberList.stream().map(num->{
            if(num%2!=0){
                return  num*2;
            }
            return num;
        }).toList();
        System.out.println("Given a list of integers, multiply each odd number by 2 and skip even numbers...."+multiplyList);

        // Convert a list of Employee to list of their names.
        List<Employee> employeesList = new ArrayList<>(Arrays.asList(new Employee("Dinesha",25),new Employee("Ajaye",24),new Employee("Akila",24)));
        List<String> employeeNames = employeesList.stream().map(Employee::getEmpName).toList();
        System.out.println("Convert a list of Employee to list of their names."+employeeNames);

        // Given a list of strings, sort them by their last character.
        List<Employee> sortedEmployee = employeesList.stream().sorted(Comparator.comparing(employee -> {
            return employee.getEmpName().charAt(employee.getEmpName().length()-1);
        })).toList();
        System.out.println("Given a list of strings, sort them by their last character....");
        sortedEmployee.stream().forEach(employee -> System.out.print(employee.getEmpName()+" "));
        System.out.println();

        // Use limit() and skip() in a stream pipeline.
        List<Integer> numberList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> limitSkipList = numberList1.stream().filter(num->num%2==0).skip(2).limit(2).toList();
        System.out.println("Use limit() and skip() in a stream pipeline..."+limitSkipList);

        // Use peek() to log elements during stream processing.
        Stream<String> fruitStream = Stream.of("banana","mango","apple","orange");
        fruitStream.map(String::toUpperCase).peek(System.out::print).forEach(e->{});

        // Chain map() after filter() for transformation and cleanup.
        List<String> emails = Arrays.asList("Test@Email.com", null, "", "user@site.com");
        List<String> filteredEmail = emails.stream().filter(em->em!=null && !em.trim().isEmpty()).map(String::toLowerCase).toList();
        System.out.println("Chain map() after filter() for transformation and cleanup."+filteredEmail);

        // Ternary Operation

        // Count the number of elements matching a condition using count().
        Long evenCountList = numberList1.stream().filter(num->num%2==0).count();
        System.out.println("Count the number of elements matching a condition using count()..."+evenCountList);

        // Find any element matching a condition using findAny() or findFirst().
        Stream<String> animalsStream = Stream.of("Tiger","Lion","Lamb","Leo");
        String animalStartsWithL = animalsStream.filter(animal->animal.startsWith("L")).findAny().orElse("No Animal");
        System.out.println("Find any element matching a condition using findAny() or findFirst()."+animalStartsWithL);

        // Find the maximum and minimum number in a list using max() and min().
        Integer minimumNumber = numberList1.stream().min(Integer::compareTo).get();
        Integer maximumNumber = numberList1.stream().max(Integer::compareTo).get();
        System.out.println("Integer minimumNumber = numberList1.stream().min(Integer::compareTo).get();.."+minimumNumber+"..."+maximumNumber);

        // Use forEach() to print all even numbers from a list.
        numberList1.stream().forEach(num -> {
            if (num%2==0){
                System.out.print(num+" ");
            }
        });
        System.out.println();

        // Sum all even numbers using reduce().
        Integer evenNumberSum = numberList1.stream().filter(num->num%2==0).reduce(0,(a,b)->{
            return a+b;
        });
        System.out.println("Sum all even numbers using reduce()."+evenNumberSum);

        // Use collect(Collectors.toList()) to collect filtered elements.
        List<Integer> oddNumberList = numberList1.stream().filter(num->num%2!=0).collect(Collectors.toList());
        System.out.println("Use collect(Collectors.toList()) to collect filtered elements..."+oddNumberList);

        // Group a list of strings by their length using groupingBy()
        List<String> nameList1 = Arrays.asList("ben","gwen","tennyson","max","akila","siva");
        Map<Integer,List<String>> nameHashMap = nameList1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Group a list of strings by their length using groupingBy()"+nameHashMap);

        // Partition a list into even and odd numbers using partitioningBy()
        Map<Boolean,List<Integer>> evenOddMap = numberList1.stream().collect(Collectors.partitioningBy(num->num%2==0));
        System.out.println("Partition a list into even and odd numbers using partitioningBy()..."+evenOddMap);

        // Use Collectors.joining() to combine strings with delimiter, prefix, and suffix.
        String joinedList = nameList1.stream().collect(Collectors.joining(",","..",".."));
        System.out.println(joinedList);

        // Use Collectors.summarizingInt() to get summary statistics of a list.

    }
}
