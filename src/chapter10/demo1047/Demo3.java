package chapter10.demo1047;

public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls=Class.forName("java.util.Date");
        System.out.println(cls);
    }
}
