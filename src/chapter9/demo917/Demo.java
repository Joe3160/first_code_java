package chapter9.demo917;

public class Demo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        new Thread(m1, "票贩A").start();
        new Thread(m1, "票贩B").start();
        new Thread(m1, "票贩C").start();
    }
}
