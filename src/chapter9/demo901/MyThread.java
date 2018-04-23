package chapter9.demo901;

public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    /**
     * 覆写run，作为线程的主操作方法
     */
    public void run() {
        for (int x = 0; x <= 200; x++) {
            System.out.println(this.name + "--->" + x);
        }

    }
}
