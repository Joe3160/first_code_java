package chapter8.demo825;

public class Demo2 {
    public static void main(String[] args) {
        MsgIm2 im2 = new MsgIm2();
        im2.print("Hello World");

    }
}

/**
 * 泛型接口的实现方式2：子类不设置泛型，而为父接口明确定义一个泛型的类型
 */
class MsgIm2 implements MessageInterface<String> {
    public void print(String str) {
        System.out.println(str);
    }
}
