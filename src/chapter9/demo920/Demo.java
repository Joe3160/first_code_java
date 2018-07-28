package chapter9.demo920;

public class Demo {
    public static void main(String[] args) {
        BossA a = new BossA();
        BossB b = new BossB();
        Transaction t = new Transaction(a, b);
        new Thread(t).start();
        b.say(a);

    }
}
