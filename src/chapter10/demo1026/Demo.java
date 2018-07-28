package chapter10.demo1026;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        StringBuffer sb=new StringBuffer();
        sb.append(calendar.get(Calendar.YEAR)).append("-");
        sb.append(calendar.get(Calendar.MONTH)+1).append("-");
        sb.append(calendar.get(Calendar.DAY_OF_MONTH)).append(" ");
        sb.append(calendar.get(Calendar.HOUR_OF_DAY)).append(":");
        sb.append(calendar.get(Calendar.MINUTE)).append(":");
        sb.append(calendar.get(Calendar.SECOND));
        System.out.println(sb);

    }
}
