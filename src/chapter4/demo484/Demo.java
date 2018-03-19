package chapter4.demo484;

public class Demo {
    public static void main(String[] args) {
        //匿名内部类
        fun(new MsgInterface() {
            @Override
            public void print() {
                System.out.println("Hello World 2018");
            }
        });

    }

    public static void fun(MsgInterface msg) {
        msg.print();
    }
}
