package chapter10.demo1047;

import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date date=new Date();
        Class<?> cls=date.getClass();
        System.out.println(cls);
        System.out.println(cls.getName());
    }
}
