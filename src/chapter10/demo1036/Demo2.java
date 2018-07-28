package chapter10.demo1036;

public class Demo2 {
    public static void main(String[] args) {
        String str="a";
        System.out.println(str.matches("[abc]"));
        System.out.println(str.matches("[^abc]"));
        System.out.println("x".matches("[^abc]"));
        System.out.println("x".matches("[a-zA-Z]"));
        System.out.println("099".matches("\\d+"));
        System.out.println("9".matches("\\d?"));
        System.out.println("98".matches("\\d+"));
        System.out.println("998".matches("\\d{2}"));
        System.out.println("9998".matches("\\d{2,}"));

    }
}
