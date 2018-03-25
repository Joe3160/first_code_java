package chapter8.demo826;

public class Demo {
    public static void main(String[] args) {
        fun("Hello");
        fun(200);//自动装箱,Integer

    }

    /**
     * 定义泛型方法
     * @param t
     * @param <T>
     */
    public static <T> void fun(T t) {
        System.out.println(t);
    }

}



