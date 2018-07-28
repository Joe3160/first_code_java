package chapter9.demo923;

import chapter9.demo922.Message;

public class Producer implements Runnable {
    private Message msg = null;

    public Producer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                this.msg.set("Joe", "Hello World");
            } else {
                this.msg.set("洲洲", "你好，世界");
            }
        }
    }
}
