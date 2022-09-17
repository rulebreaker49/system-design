public class Task implements Runnable{

    int num = -1;
    public Task(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Hello: " + num);
    }
}
