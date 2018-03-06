package chapter3.lesson16.demo3110;

public class Outer {
    private static String msg="Hello World";
    static class Inner{
        public void print(){
            System.out.println(Outer.msg);
        }
    }
}
