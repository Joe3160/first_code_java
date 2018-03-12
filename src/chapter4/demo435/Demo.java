package chapter4.demo435;

public class Demo {
    public static void main(String[] args) {
        fun(new B());

    }

    public static void fun(A a){
        a.print();
        if (a instanceof B) {
            B b=(B) a;
            b.funB();
        }
    }
}
