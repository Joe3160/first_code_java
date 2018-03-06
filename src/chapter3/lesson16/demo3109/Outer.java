package chapter3.lesson16.demo3109;

public class Outer {
    private static String msg="Hello World";
    static class Inner{
        public void print(){
            System.out.println(Outer.msg);//直接访问外部类属性
        }
    }
}
