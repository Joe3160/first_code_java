package chapter4.demo443;

public class Demo {
    public static void main(String[] args) {
        A a=A.getInstanceB();//调用隐藏的子类
        a.print();
    }
}
