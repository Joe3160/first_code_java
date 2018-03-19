package chapter4.demo489;

public class Demo {
    public static void main(String[] args) {
        Integer obj = 10;//自动装箱
        int temp = obj;//自动拆箱
        System.out.println(temp);

        //手动装箱
        Integer ob1 = new Integer(10);
        //手动拆箱
        int temp1 = ob1.intValue();
        System.out.println(temp1);

    }
}
