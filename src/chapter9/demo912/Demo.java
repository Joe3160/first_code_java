package chapter9.demo912;

public class Demo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        new Thread(m1, "线程A").start();//设置线程名称并启动线程
        new Thread(m1).start();
        new Thread(m1, "线程B").start();
        new Thread(m1).start();
        new Thread(m1).start();
    }
}
