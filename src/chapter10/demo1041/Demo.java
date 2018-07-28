package chapter10.demo1041;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        String str = "2018-08-08";
        String regex="\\d{4}(-\\d{2}){2}";
        boolean flag=str.matches(regex);
        System.out.println(flag);
        if (flag) {
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(str);
            System.out.println(date);

        }
    }
}
