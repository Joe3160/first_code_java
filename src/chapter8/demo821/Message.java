package chapter8.demo821;

public class Message<T> {
    private T msg;

    public Message(T msg) {
        this.msg = msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }

    public T getMsg() {
        return msg;
    }
}
