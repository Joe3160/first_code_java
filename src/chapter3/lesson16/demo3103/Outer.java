package chapter3.lesson16.demo3103;

public class Outer {//定义外部类
    private String msg="Hello world";
    class Inner{//定义内部类
        public void print(){
            System.out.println(msg);
        }
    }

    public void fun(){
        new Inner().print();
    }
}
