package chapter10.demo1003;

/**
 * String与StringBuffer互转
 */
public class Demo {
    public static void main(String[] args) {
        //String 转为StringBuffer
        StringBuffer buffer = new StringBuffer("Hello World");
        System.out.println(buffer);

        StringBuffer buff = new StringBuffer();
        buff.append("Hello World");
        System.out.println(buff);

        //StringBuffer转为String
        StringBuffer buff2=new StringBuffer("你好，世界");
        String str=buff2.toString();
        System.out.println(str);

        StringBuffer buff3=new StringBuffer("你好");
        String str2=new String(buff3);
        System.out.println(str2);

        //String 比较StringBuffer
        StringBuffer buff4=new StringBuffer("世界");
        System.out.println("世界".contentEquals(buff4));
    }
}
