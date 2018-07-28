package chapter9.demo919;

public class MyThread implements Runnable {
    private int num = 5;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.sale();
        }
    }

    /**
     * 同步方法
     */
    public synchronized void sale() {
        if (this.num > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +
                    " 卖出一张票，剩余 " + (--this.num)
            );
        }

    }
}
