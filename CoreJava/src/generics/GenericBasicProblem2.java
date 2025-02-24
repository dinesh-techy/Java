package generics;


import java.util.ArrayList;
import java.util.List;


// Write a generic method to print elements

public class GenericBasicProblem2{
    public static <T> void printItems(T... items) {
        for (T item : items) {
            System.out.print(item +"....");
        }
    }
    public static void main(String[] args) {
        System.out.println("Mixed Items:");
        Object[] items= {"Red", 1, 2.5, true, 'A'};
        printItems(items);
    }
}
