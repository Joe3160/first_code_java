package chapter4.demo446;

public class Human extends Action {
    @Override
    public void eat() {
        System.out.println("人在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("人类在休息");
    }

    @Override
    public void work() {
        System.out.println("人类在工作");
    }
}
