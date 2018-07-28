package chapter9.demo923;

import chapter9.demo922.Message;

public class Consumer implements Runnable {
    private Message msg = null;

    public Consumer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.msg.get();
        }
    }
}
