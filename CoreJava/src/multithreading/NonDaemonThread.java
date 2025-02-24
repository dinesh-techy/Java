package multithreading;


class NonDaemonThread1 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Non DaemonThread started..."+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Non DaemonThread ended..."+Thread.currentThread().getName());
        }
    }
}

public class NonDaemonThread {

    public static void main(String[] args) {
        System.out.println("Program Execution Starts..."+Thread.currentThread().getName());
        NonDaemonThread1 nonDaemonThread1 = new NonDaemonThread1();
        nonDaemonThread1.start();
        System.out.println("Program Execution ends..."+Thread.currentThread().getName());
    }
}
