package chapter4.demo446;

public class Robot extends Action {
    @Override
    public void eat() {
        System.out.println("机器人在充电。。");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void work() {
        System.out.println("机器人在工作。。");
    }
}
