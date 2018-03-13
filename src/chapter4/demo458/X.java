package chapter4.demo458;

public class X extends A.B implements A {
    @Override
    public void funA() {
        System.out.println("Hello World");
    }

    @Override
    public void funB() {
        System.out.println("X继承A的内部抽象类B");
    }

    class Y extends B {
        @Override
        public void funB() {
            System.out.println("X.Y继承了A.B");
        }
    }
}
