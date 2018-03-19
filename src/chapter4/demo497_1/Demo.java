package chapter4.demo497_1;

public class Demo {
    public static void main(String[] args) {
        int a = 100;
        //转为字符串
        String b = a + "";
        System.out.println(b.replaceAll("0", "2"));
        //转为字符串
        String c = String.valueOf(a);
        System.out.println(c.replaceAll("0", "2"));
    }
}
