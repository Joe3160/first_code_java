package chapter4.demo456;

public class X extends C implements A,B {
    @Override
    public void print() {
        System.out.println("A的抽象方法");
    }

    @Override
    public void get() {
        System.out.println("B的抽象方法");
    }

    @Override
    public void change() {
        System.out.println("C的抽象方法");
    }
}
