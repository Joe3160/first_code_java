package chapter9.demo918;

public class Demo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        new Thread(m1, "黄牛A").start();
        new Thread(m1, "黄牛B").start();
        new Thread(m1, "黄牛C").start();
        new Thread(m1, "黄牛D").start();
    }
}
