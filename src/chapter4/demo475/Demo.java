package chapter4.demo475;

public class Demo {
    public static void main(String[] args) {
        A a = new B();//往上转型，自动转型
        Object obj = a;//往上转型，object接收接口对象
        A b = (A) obj;//向下转型，须用强转
        b.fun();
        System.out.println(b);


    }
}
