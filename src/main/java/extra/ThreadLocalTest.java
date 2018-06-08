package extra;

import java.util.Random;

public class ThreadLocalTest extends Object{


    static class MyRunnable implements Runnable {

        private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

        public void run() {
            Random random = new Random();
            threadLocal.set(random.nextInt());
            System.out.println(Thread.currentThread().getName()  + " " + threadLocal.get());
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
