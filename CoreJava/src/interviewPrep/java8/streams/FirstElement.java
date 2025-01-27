//https://www.geeksforgeeks.org/find-the-first-element-of-a-stream-in-java/
//Input: Stream = {“Geek_First”, “Geek_2”, “Geek_3”, “Geek_4”, “Geek_Last”}
//Output: Geek_First
//
//Input: Stream = {1, 2, 3, 4, 5, 6, 7}
//Output: 1

package interviewPrep.java8.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FirstElement {
    public static void main(String[] args) {
        // This will throw IllegalStateException as stream is reused - https://www.baeldung.com/java-stream-operated-upon-or-closed-exception
        // Stream<String> names = Stream.of("Dinesh","Sivashankar","Ajaye");
        Supplier<Stream<String> >names = ()-> Stream.of("Dinesh","Sivashankar","Ajaye");

        // Using findFirst
        String firstElement = names.get().findFirst().orElse(null);
        System.out.println(firstElement);

        // Using reduce method
        String firstElement1 = names.get().reduce((first,second)->first).orElse(null);
        System.out.println(firstElement1);
    }
}
