package chapter8.demo823;

public class Demo {
    public static void main(String[] args) {
        Message<Integer> m1=new Message<>();
        m1.setMsg(100);
        fun(m1);
    }

    public static void fun(Message<? extends Number> temp){
        System.out.println(temp.getMsg());
    }
}
