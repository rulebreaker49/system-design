package Threads;

public class Fundamental {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Task());
        thread.setDaemon(true);
        thread.start();
        //Thread.sleep(10000000);
    }
}
