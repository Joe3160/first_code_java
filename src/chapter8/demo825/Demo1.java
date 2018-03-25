package chapter8.demo825;

/**
 * 泛型的实现方式1：在子类继续设置泛型标记
 * 即就是父接口使用的泛型沿用接口子类所设置的泛型。
 * @param <T>
 */
class MsgIm<T> implements MessageInterface<T> {
    @Override
    public void print(T t) {
        System.out.println(t);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        MsgIm<String> m1 = new MsgIm<>();
        m1.print("Hello");
    }

}
