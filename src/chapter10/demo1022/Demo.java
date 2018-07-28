package chapter10.demo1022;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        Date date=new Date(time);
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
