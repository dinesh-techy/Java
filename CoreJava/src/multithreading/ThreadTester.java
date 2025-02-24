package multithreading;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main is executed....."+Thread.currentThread());
        Thread thread1 = new Thread1("Thread 1");
        thread1.start();
        Thread thread2 = new Thread(new Thread2(),"Thread 2");
        thread2.start();
        thread1.join(); // Makes sure the thread 1 is completed
        System.out.println("Main is exciting....."+Thread.currentThread());
    }
}
