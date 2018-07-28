package chapter9.demo914;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int x = 0; x < 1000; x++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "，x=" + x);
        }
    }
}
