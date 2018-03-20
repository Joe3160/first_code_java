package chapter5.demo519;

public class Singleton {
    /**
     * 定义静态的、不可修改的实例对象
     * 故无论外部怎么调用多次，整个程序运行过程中只有一个该类的实例
     *  可节省实例的次数，节省内存
     */
    private final static Singleton instance = new Singleton();

    /**
     * private加持，该类不可被外部类实例化
     */
    private Singleton() {
    }

    /**
     * 唯一可获该类的实例化对象的通道。
     * 而且每次所获得的实例都是同一个对象
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }

    /**
     * 可执行方法
     */
    public void print() {
        System.out.println("Hello World");
    }


}
