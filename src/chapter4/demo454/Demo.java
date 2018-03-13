package chapter4.demo454;

public class Demo {
    public static void main(String[] args) {
        X x=new X();
        x.print();
        x.get();
        System.out.println(A.MSG);
        System.out.println("-------------");
        A a=x;//向上转型
        B b=x;//向上转型
        a.print();
        b.get();
    }
}
