package chapter9.demo910;

import java.util.concurrent.Callable;

public class Ticket implements Callable<String> {
    private int ticket = 5;
    private String title;

    public Ticket(String title) {
        this.title = title;
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 200; i++) {
            if (this.ticket > 0) {
                System.out.println(this.title + " 成功卖出第" + (i + 1) + "张票。");
                this.ticket--;
            }
        }
        return "票卖完了";

    }
}

