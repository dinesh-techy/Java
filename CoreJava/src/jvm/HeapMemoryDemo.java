package jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapMemoryDemo {

    // List to hold objects and simulate memory consumption
    private static List<byte[]> memoryHolder = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("HeapMemoryDemo started. Attach JConsole now!");

        // Sleep to give time to attach JConsole
        Thread.sleep(10000);

        for (int i = 0; i < 20; i++) {
            allocateMemory();
            System.out.println("Iteration " + i + " - Allocated memory.");
            Thread.sleep(2000);
        }

        System.out.println("Done allocating memory. Now clearing memory...");

        System.gc();

        System.out.println("Memory cleared. Observing GC...");
        Thread.sleep(10000); // Sleep again to watch GC activity
    }

    private static void allocateMemory() {
        // Allocate 5 MB chunks
        byte[] chunk = new byte[5 * 1024 * 1024];
        memoryHolder.add(chunk);
    }
}
