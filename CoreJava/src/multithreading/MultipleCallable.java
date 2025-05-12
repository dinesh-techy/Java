package multithreading;

import java.util.List;
import java.util.concurrent.*;

class Task3 implements Callable<String> {
    private String taskName;
    private int delay;

    public Task3(String taskName, int delay) {
        this.taskName = taskName;
        this.delay = delay;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(delay);
        return "Task ... "+taskName+" invoked after "+delay+" seconds";
    }
}

public class MultipleCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Task3> tasksList = List.of(new Task3("Task A",5000),new Task3("Task B",8000),new Task3("Task C",3000));
        // Wait for all tasks to complete
        List<Future<String>>futuresList = executorService.invokeAll(tasksList);
        for(Future<String> future:futuresList){
            System.out.println(future.get());
        }
        // Wait for any one task to complete
        List<Task3> tasksList2 = List.of(new Task3("Task A",5000),new Task3("Task B",8000),new Task3("Task C",3000));
        String invoked = executorService.invokeAny(tasksList2);
        System.out.println(invoked);
        executorService.shutdown();
    }
}
