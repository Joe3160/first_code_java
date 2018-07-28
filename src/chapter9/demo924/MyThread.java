package chapter9.demo924;

public class MyThread implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (this.flag) {
            String name = Thread.currentThread().getName();
            System.out.println((++i) + "、" + name + "运行");
        }
    }

    public void stop() {
        this.flag=false;
    }
}
