package chapter4.demo454;

public class X implements A, B {
    @Override
    public void print() {
        System.out.println("A接口的抽象方法");
    }

    @Override
    public void get() {
        System.out.println("B接口的抽象方法");
    }
}
