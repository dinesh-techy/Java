package multithreading;

class VolatileDemo{
    static volatile int targetValue=1;

    public static void printRunner() throws InterruptedException {
        System.out.println("Thread before while..."+Thread.currentThread().getName());
        while (VolatileDemo.targetValue!=100){
            // An infinite loop will run till targetValue becomes 100
        }
        System.out.println("Exit from printRunner"+Thread.currentThread().getName());
    }
}

public class VolatileKeyword {
    public static void main(String[] args) throws InterruptedException {
        // Start a thread that tries to print the printRunner
        Thread thread = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName());
                VolatileDemo.printRunner();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start(); // Start the worker thread
        Thread.sleep(5000);// Sleepp the main thread
        VolatileDemo.targetValue=100;
    }
}
