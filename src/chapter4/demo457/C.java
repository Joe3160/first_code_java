package chapter4.demo457;

/**
 * 一个抽象类可以实现多个接口，反之一个接口不可以继承抽象类。
 * 但一个接口可以通过关键字extends继承多个父接口
 *
 */
public interface C extends A,B {
    public  void funC();
}

