package chapter8.demo823;

/**
 * extends 类：设置泛型的上限
 * @param <T>
 */
public class Message<T extends Number> {
    private T msg;

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg){
        this.msg=msg;

    }
}
