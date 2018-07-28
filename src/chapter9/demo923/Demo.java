package chapter9.demo923;

import chapter9.demo922.Message;

public class Demo {
    public static void main(String[] args) {
        Message msg=new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
