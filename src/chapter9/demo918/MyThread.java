package chapter9.demo918;

public class MyThread implements Runnable {
    private int num = 10;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                if (this.num > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() +
                            " 卖出一张票，剩余" + (--this.num));

                }
            }
        }
    }
}
