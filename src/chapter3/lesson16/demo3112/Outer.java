package chapter3.lesson16.demo3112;

public class Outer {
    private String msg = "Hello World";

    public void fun(int num) {
        double score = 99.9;
        class Inner {
            public void print() {
                System.out.println("属性：" + Outer.this.msg);
                System.out.println("方法参数：" + num);
                System.out.println("方法变量：" + score);
            }
        }
        new Inner().print();

    }
}
