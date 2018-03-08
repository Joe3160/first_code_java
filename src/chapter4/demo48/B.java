package chapter4.demo48;

public class B extends A {
    public B(String title) {
        super(title);//父类已定义了构造方法且不提供无参构造方法，则不能隐式调用了父类无参的构造方法,只能显式调用
        System.out.println("B、B类的构造方法");
    }
}
