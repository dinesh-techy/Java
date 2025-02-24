package multithreading;


class DaemonThread1 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("DaemonThread started..."+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("DaemonThread ended..."+Thread.currentThread().getName());
        }
    }
}
public class DaemonThreadExample {
    public static void main(String[] args) {
        System.out.println("Program Execution Starts..."+Thread.currentThread().getName());
        DaemonThread1 daemonThread1 = new DaemonThread1();
        daemonThread1.setDaemon(true); // Daemon Thread
        daemonThread1.start();
        System.out.println("Program Execution ends..."+Thread.currentThread().getName());
    }
}
