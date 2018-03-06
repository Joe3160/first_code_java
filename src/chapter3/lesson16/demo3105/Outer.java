package chapter3.lesson16.demo3105;

public class Outer {
    private String msg="Hello World";
    class Inner{
        private String info="世界，你好";
        public void print(){
            System.out.println(msg);
        }
    }

    public void fun(){
        Inner inner=new Inner();
        System.out.println(inner.info);
    }
}
