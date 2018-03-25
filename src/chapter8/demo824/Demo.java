package chapter8.demo824;

public class Demo {
    public static void main(String[] args) {
        Message<String> m1 = new Message<>();
        m1.setMsg("Hello World");
        fun(m1);
        Message<Integer> m2 = new Message<>();
        m2.setMsg(100);
        //fun(m2);//无法调用，因为fun定义了泛型的下限


    }

    public static void fun(Message<? super String> temp) {
        System.out.println(temp.getMsg());
    }
}


class Message<T> {
    private T msg;

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}
