package chapter3.lesson16.demo3107;

public class Outer {
    private String msg="Hello World";
    public class Inner{// 如果不想被外部类调用，可以用private
        public void print(){
            System.out.println(Outer.this.msg);
        }
    }

}
