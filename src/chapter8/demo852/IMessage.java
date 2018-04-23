package chapter8.demo852;

@FunctionalInterface
public interface IMessage<P> {
    public int compare(P p1, P p2);
}
