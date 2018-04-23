package chapter9.demo901;

public class Demo {
    public static void main(String[] args) {
        //实例化多线程类对象
        MyThread m1 = new MyThread("线程A");
        MyThread m2 = new MyThread("线程B");
        MyThread m3 = new MyThread("线程C");
        //启动线程
        m1.start();
        m2.start();
        m3.start();

    }
}
