package chapter3.lesson8.section4;

public class Demo {
    public static void main(String[] args) {
        String str1=new String("Hello");
        String str2="Hello";
        System.out.println(str1==str2);
        String str3=new String("Hello").intern();//手工入池
        System.out.println(str2==str3);

    }
}
