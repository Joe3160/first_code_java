package chapter6.demo611;

public class Test {
    public static void main(String[] args) {
        int x=100;
        int y=0;
        try {
            int ret = Demo.div(x, y);
            System.out.println(ret);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
