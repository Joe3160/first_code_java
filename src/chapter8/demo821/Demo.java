package chapter8.demo821;

public class Demo {
    public static void main(String[] args) {
        Message<String> msg1 = new Message<>("Hello");
        fun(msg1);
        Message<Integer> msg2 = new Message<>(101);
        fun(msg2);
        System.out.println("------------------------");
        //引用类型
        //引用对象传递的时引用地址，
        //对于引用对象a,b,如果执行b=a 表示a将引用地址传给b, a,b同时引用同一个堆内存，
        //若b修改了值，a的值也跟着改变
        Message<String> msg3 = msg1;
        msg3.setMsg("changed !");
        fun(msg1);
        fun(msg3);


    }

    public static void fun(Message<?> message) {
        //message.setMsg(100);//不能设置，只能读取
        System.out.println(message.getMsg());
    }
}
