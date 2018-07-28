package chapter10.demo1024;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将日期字符串变为Date对象
 */
public class Demo {
    public static void main(String[] args) throws ParseException {
        String str="2018-15-09 00:00:45:487";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
        Date date=sdf.parse(str);
        System.out.println(date);


    }
}
