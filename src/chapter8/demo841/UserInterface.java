package chapter8.demo841;

public interface UserInterface {
    public void print();

    /**
     * 在接口里定普通的方法
     * @since Java 1.8后才支持这样的写法
     */
    default void fun() {
        System.out.println("It's amazing");
    }

    static void fun2() {
        System.out.println("这是一个神奇的方法");
    }
}
