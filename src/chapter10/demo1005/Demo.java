package chapter10.demo1005;

public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abde");
        sb.insert(2,"CC");
        System.out.println(sb);
    }
}
