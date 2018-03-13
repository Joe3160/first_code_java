package chapter4.demo459;

public interface A {
    public void funA();

    static interface B {//static修饰一个内部接口，相当定义了一个外面接口

        public void funB();
    }
}
