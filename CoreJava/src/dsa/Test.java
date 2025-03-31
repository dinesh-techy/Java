package dsa;

import java.util.*;

class Test {
    public static int minimumSize(int[] weights, int n, int trucks, int maxCapacity) {
        int low = Arrays.stream(weights).max().getAsInt(); // Minimum capacity (largest box)
        int high = Arrays.stream(weights).sum(); // Maximum capacity (sum of all boxes)
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isFeasible(weights, n, trucks, mid, maxCapacity)) {
                result = mid; // Possible solution, try minimizing it
                high = mid - 1;
            } else {
                low = mid + 1; // Increase capacity
            }
        }

        return result;
    }

    // Function to check if `capacity` can distribute boxes within `trucks` constraint
    private static boolean isFeasible(int[] weights, int n, int trucks, int capacity, int maxCapacity) {
        int truckCount = 1, currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                truckCount++;  // Use a new truck
                currentLoad = weight;

                if (truckCount > trucks || weight > maxCapacity) return false;
            } else {
                currentLoad += weight;
            }
        }

        return truckCount <= trucks;
    }

    public static void main(String[] args) {
        int[] weights = {4,3,5};
        int n = weights.length;
        int trucks = 3;
        int maxCapacity = 15;

        int result = minimumSize(weights, n, trucks, maxCapacity);
        System.out.println(result); // Expected minimum truck capacity required
    }
}
