package chapter9.demo913;

import chapter9.demo912.MyThread;

public class Demo {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        new Thread(m1,"自己的线程").start();
        m1.run();
    }
}
