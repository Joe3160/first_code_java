package chapter8.demo850;

public interface IMessage<P, R> {
    public R convert(P p);
}
