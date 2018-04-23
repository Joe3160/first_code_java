package chapter9.demo906;

public class Demo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread("线程A");
        MyThread m2 = new MyThread("线程B");
        MyThread m3 = new MyThread("线程C");
        new Thread(m1).start();
        new Thread(m2).start();
        new Thread(m3).start();
    }
}
