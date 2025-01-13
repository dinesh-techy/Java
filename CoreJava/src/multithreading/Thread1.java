package multithreading;

// Creating thread by extending Thread class
public class Thread1 extends Thread {
    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("THREAD 1...."+i+"..."+Thread.currentThread()+i);
        }
    }
}
