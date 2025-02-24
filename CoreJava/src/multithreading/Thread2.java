package multithreading;

import java.util.Date;

// Creating thread by implementing Runnable
public class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                System.out.println(Thread.currentThread().getName()+"...."+i+"..."+Thread.currentThread().getName()+"..."+new Date());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
