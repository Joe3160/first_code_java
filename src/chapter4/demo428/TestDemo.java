package chapter4.demo428;

import chapter4.demo427.*;

public class TestDemo {
    public static void main(String[] args) {
        A a = new B();//实例化的时子类，对象向上转型
        a.print();//调用被子类的覆写的方法
    }
}
