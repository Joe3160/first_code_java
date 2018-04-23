package chapter8.demo851;

@FunctionalInterface //此为函数式接口，只能定义一个方法，不能定义多个方法
public interface IMessage<R> {
    public R upper();
}
