package chapter9.demo915;

public class Demo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        Thread t1 = new Thread(m1, "线程1");
        Thread t2 = new Thread(m1, "线程2");
        Thread t3 = new Thread(m1, "线程3");
        t3.setPriority(Thread.MAX_PRIORITY);//设置优先级
        t1.start();
        t2.start();
        t3.start();

    }
}
