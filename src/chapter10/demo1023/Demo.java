package chapter10.demo1023;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将日期Date对象变为日期字符串
 */
public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String str = simpleDate.format(date);
        System.out.println(str);
    }
}
