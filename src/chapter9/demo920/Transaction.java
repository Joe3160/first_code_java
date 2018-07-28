package chapter9.demo920;

public class Transaction implements Runnable {
    private BossA a;
    private BossB b;

    public Transaction(BossA a, BossB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        a.say(b);

    }
}
