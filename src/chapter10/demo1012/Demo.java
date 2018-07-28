package chapter10.demo1012;

public class Demo {
    public static void main(String[] args) {
        Foo foo=new Foo();
        foo=null;
        System.gc();
    }
}
