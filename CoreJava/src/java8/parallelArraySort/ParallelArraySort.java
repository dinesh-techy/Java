package java8.parallelArraySort;

import java.util.Arrays;

public class ParallelArraySort {
    public static void main(String[] args) {
        // Complete array sort
        int [] numbers = {9,10,8,1,2,7,3};
        Arrays.parallelSort(numbers);
        System.out.println(Arrays.toString(numbers));
        // Sort Array based on index
        int [] numbers2 = {9,10,8,1,2,7,3};
        Arrays.parallelSort(numbers2,2,5);
        System.out.println(Arrays.toString(numbers2));
    }
}
