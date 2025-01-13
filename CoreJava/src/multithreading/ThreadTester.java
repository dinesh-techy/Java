package multithreading;

import java.util.Arrays;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main is executed....."+Thread.currentThread());
        Thread thread1 = new Thread1("Thread 1");
        thread1.start();
        Thread thread2 = new Thread(new Thread2(),"Thread 2");
        thread2.start();
        System.out.println("Main is exciting....."+Thread.currentThread());
    }
}
