package multithreading;

import java.util.concurrent.*;

class Task2 implements Callable<String>{
    @Override
    public String call() throws Exception {
        Thread.sleep(10000);
        return "Task 2 completed after a 10000 delay";
    }
}
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> futureString = executorService.submit(new Task2());
        System.out.println(futureString.isDone() ? "Task Complted":"Task running");
        try {
            System.out.println(futureString.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
