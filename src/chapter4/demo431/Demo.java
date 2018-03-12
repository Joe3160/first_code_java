package chapter4.demo431;

public class Demo {
    public static void main(String[] args) {
        fun(new B());//自动向上转型成A
        fun(new C());//自动向上转型成A

    }

    private static void fun(A a) {
        a.print();
    }
}
