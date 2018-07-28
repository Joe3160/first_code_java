package chapter10.demo1056;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Demo {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        ResourceBundle re = ResourceBundle.getBundle("Message");
        String val = re.getString("info");
        System.out.println(val);
        //占位符
        //welcome=你好{0}！欢迎来到{1}
        String str2 = re.getString("welcome");
        System.out.println(str2);
        String str2_after = MessageFormat.format(str2, "蔡先生", "中国");
        System.out.println(str2_after);
    }
}
