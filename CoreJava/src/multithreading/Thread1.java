package multithreading;

import java.util.Date;

// Creating thread by extending Thread class
public class Thread1 extends Thread {
    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                System.out.println(Thread.currentThread().getName()+"...."+i+"..."+new Date());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
