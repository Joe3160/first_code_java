package chapter9.demo924;

public class Demo {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        Thread t1=new Thread(m,"线程t1");
        //Thread t2=new Thread(m,"线程t2");
        t1.start();
        //t2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m.stop();
    }
}
