package chapter9.demo921;

public class Consumer implements Runnable {
    private Message msg = null;

    public Consumer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.msg.getTitle() + "-->" + this.msg.getContent());
        }
    }
}
