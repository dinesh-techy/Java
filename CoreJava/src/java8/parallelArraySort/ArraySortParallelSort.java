package java8.parallelArraySort;

import java.util.Arrays;
import java.util.Random;

public class ArraySortParallelSort {
    public static void main(String[] args) {
        // Generate large random array
        int[] numbers = new Random().ints(100_000, 0, 1_000_000).toArray();

        // JVM Warm-up
        for (int i = 0; i < 5; i++) {
            Arrays.sort(Arrays.copyOf(numbers, numbers.length));
            Arrays.parallelSort(Arrays.copyOf(numbers, numbers.length));
        }

        // Serial Sort
        long startTime = System.nanoTime();
        int[] numbers1 = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numbers1);
        long endTime = System.nanoTime();
        System.out.println("Serial Sort time: " + (endTime - startTime) + " ns");

        // Parallel Sort
        long startTime1 = System.nanoTime();
        int[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        Arrays.parallelSort(numbers2);
        long endTime1 = System.nanoTime();
        System.out.println("Parallel Sort time: " + (endTime1 - startTime1) + " ns");
    }
}
