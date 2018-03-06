package chapter3.lesson16.demo3107;

public class Demo {
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.print();
    }
}
