package chapter10.demo1044;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String str = "A B  C  D E  F   G";
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);//编译正则
        String[] result = pattern.split(str);//拆分字符串
        System.out.println(Arrays.toString(result));
        String mobile="13512783986";
        Pattern pm=Pattern.compile("^\\d+$");
        Matcher mat=pm.matcher(mobile);
        System.out.println(mat.matches());

    }
}
