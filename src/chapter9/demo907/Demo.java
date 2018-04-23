package chapter9.demo907;

public class Demo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("线程A");
        Ticket t2 = new Ticket("线程B");
        Ticket t3 = new Ticket("线程C");
        //相当于三个专卖店同时在卖票，有可能卖多，因为彼此之间并没有交流
        t1.start();
        t2.start();
        t3.start();
    }
}
