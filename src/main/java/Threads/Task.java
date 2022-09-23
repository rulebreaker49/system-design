package Threads;

public class Task implements Runnable {
    @Override
    public void run() {
        Thread thread2 = new Thread();
        thread2.start();
        System.out.println(thread2.isDaemon());
    }
}
