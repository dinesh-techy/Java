package interviewPrep.finalExample;

import java.util.Arrays;

public class FinalExample {
    public static void main(String[] args) {
        final String name="Dinesh";
        System.out.println(name);
       // name="Ajaye"; // Compilation error
        System.out.println(name);
    }
}
