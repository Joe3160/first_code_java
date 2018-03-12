package chapter4.demo444;

public class B extends A {
    private int num = 100;

    public B(int num) {
        this.num = num;
    }

    @Override
    public void print() {
        System.out.println("num=" + num);
    }
}
