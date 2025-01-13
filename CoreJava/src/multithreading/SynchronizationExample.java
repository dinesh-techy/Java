package multithreading;

class SharedResource{
    private int count=0;
    public synchronized void increment(){
        // To simulate the race condition
        try {
            Thread.sleep(1); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }
    public int getCount(){
        return count;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread thread1 = new Thread(()->{
            for (int i=0;i<100;i++){
                resource.increment();
            }
        },"Thread 1");
        Thread thread2 = new Thread(()->{
            for (int i=0;i<100;i++){
                resource.increment();
            }
        },"Thread 2");
        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Count: " + resource.getCount());
        StringBuffer stringBuffer = new StringBuffer();
    }
}
