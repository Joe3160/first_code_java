package chapter9.demo920;

public class BossB {
    public synchronized void say(BossA a) {
        System.out.println("BossB说：把你的钱给我，我把货给你，否则不给");
        a.get();

    }

    public synchronized void get() {
        System.out.println("BossB：得到了钱，交出了货。");
    }
}
