package multithreading.ExecutorService;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
    public Task(String name) {
        super(name);
    }

    @Override
    public void run() {
       for(int i=1;i<100;i++){
           try {
               System.out.println(Thread.currentThread().getName()+"..."+i);
               Thread.sleep(2);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}

public class ExecutorServiceSingleThreadedExec {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // Execute Task 1
        executorService.execute(new Task("Thread 1"));
        executorService.execute(new Thread(new Task("Thread 2")));
    }
}
