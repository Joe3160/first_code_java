package chapter9.demo921;

public class Producer implements Runnable {
    private Message msg = null;

    public Producer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                this.msg.setTitle("Joe");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.msg.setContent("Hello World");
            } else {
                this.msg.setTitle("洲洲");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.msg.setContent("你好，世界");
            }
        }
    }
}
