package multithreading.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private final String taskName;

    public Task(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.printf("%s - %s: %d%n", Thread.currentThread().getName(), taskName, i);
                Thread.sleep(10); // Slight delay to observe interleaving (0 makes it too fast to see)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // good practice
                System.out.println(taskName + " was interrupted.");
            }
        }
    }
}

public class BasicExecutorService {
    public static void main(String[] args) {
        // newSingleThreadExecutor - for single thread application (Uses single thread to perform task)
        ExecutorService executorService = Executors.newScheduledThreadPool(2);

        executorService.execute(new Task("Task-A"));
        executorService.execute(new Task("Task-B"));
        executorService.shutdown();
        // Thread which is not part of Executor Service
        Task mainTask = new Task("Task -C");
        Thread mainTaskThread = new Thread(mainTask);
        mainTaskThread.start();
    }
}
