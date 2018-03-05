package chapter3.lesson8;

/**
 * String
 */
public class Demo {
    public static void main(String[] args) {

        // ==比较内存地址
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2;
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

        System.out.println("----------------");
        // string.equals()比较内容
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

    }
}
