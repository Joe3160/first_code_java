package chapter10.demo1061;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Demo {
    public static void main(String[] args) {
        String baseName = "chapter10.demo1061.Message";
        // zh_CN
        Locale locale_cn = new Locale("zh", "CN");
        ResourceBundle rb = ResourceBundle.getBundle(baseName, locale_cn);
        //MessageFormat.format用替换占位符
        String str_cn = MessageFormat.format(rb.getString("welcome"), "蔡先生", "深圳");
        System.out.println(str_cn);
        System.out.println("--------------");
        //en_US
        Locale locale_en = new Locale("en", "US");
        ResourceBundle rb_en = ResourceBundle.getBundle(baseName, locale_en);
        String str_en = rb_en.getString("welcome");
        System.out.println(str_en);
        String str_en_ret = MessageFormat.format(str_en, "Joe", "Shengzhen");
        System.out.println(str_en_ret);
    }
}
