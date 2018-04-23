package chapter8.demo845;

public class Demo {
    public static void main(String[] args) {
        fun(() -> System.out.println("Hello"));

    }

    public static void fun(MsgInterface msg){
        msg.print();
    }
}

interface MsgInterface {
    public void print();
}
