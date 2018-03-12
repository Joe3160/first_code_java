package chapter4.demo429;

import chapter4.demo427.*;

public class Demo {
    public static void main(String[] args) {
        A a = new B();//实例化是子类，向上转型
        B b = (B) a;//对象需要强制向下转型
        b.print();

        //向下转型必须发生过向上转型后才能向下转型，下面将报错
        //A a1 = new A();
        //B b1 = (B) a1;
        //b1.print();
    }
}
