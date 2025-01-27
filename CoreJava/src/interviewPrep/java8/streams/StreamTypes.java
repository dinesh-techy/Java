package interviewPrep.java8.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;


// https://www.geeksforgeeks.org/tag/java-stream-programs/
public class StreamTypes {
    public static void main(String[] args) {
        // Using Collection.stream()
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        Stream<Integer> numberStream = numberList.stream();

        // Using Stream.of()
        Stream<String> nameList = Stream.of("Dinesh","Ajaye","Akila");

        // Using Arrays.stream()
        Integer [] marks = {10,20,30,40,50};
        Stream<Integer> marksArray = Arrays.stream(marks);

        // Using emptyStream
        Stream<Integer> numberList1 = Stream.empty();

        // Using StreamBuilder
        Stream.Builder<String> builder
                = Stream.builder();
        builder.add("India");
        builder.add("UK");
        builder.add("SriLanka");
    }
}
