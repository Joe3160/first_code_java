package chapter9.demo920;

public class BossA {
    public synchronized void say(BossB b) {
        System.out.println("BossA说：把你的货给我，我把钱给你，否则不给");
        b.get();
    }

    public synchronized void get() {
        System.out.println("BoosA：得到货，交出了钱");
    }


}
