package chapter4.demo432;

public class Demo {
    public static void main(String[] args) {
        fun(new B());

    }

    public static void fun(A a){
        B b=(B)a;
        b.funB();
    }
}
