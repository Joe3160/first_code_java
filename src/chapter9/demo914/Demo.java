package chapter9.demo914;

public class Demo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        new Thread(m1, "线程对象A").start();
        new Thread(m1, "线程对象B").start();
    }
}
