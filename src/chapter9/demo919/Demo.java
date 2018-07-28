package chapter9.demo919;

public class Demo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        new Thread(m1, "黄牛1").start();
        new Thread(m1, "黄牛2").start();
        new Thread(m1, "黄牛3").start();
        new Thread(m1, "黄牛4").start();
    }
}
