package chapter9.demo923;

public class Message {
    private String title;
    private String content;
    private boolean flag = true;


    public synchronized void set(String title, String content) {
        if (this.flag == false) {//已经生产过，不能再生产
            try {
                super.wait();//等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.title = title;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = true;
        super.notify();//唤醒其它进程
    }

    public synchronized void get() {
        if (this.flag == true) {//未生产，不能取走
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title + "---->" + this.content);
        this.flag = true;//已经取走，可以生产
        super.notify();//唤醒其它线程
    }
}
