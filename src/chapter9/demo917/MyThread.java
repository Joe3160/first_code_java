package chapter9.demo917;

public class MyThread implements Runnable {
    private int num = 5;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.num > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()
                        + "，卖出一张票，剩余 " + (--this.num)
                );
            }
        }
    }
}
