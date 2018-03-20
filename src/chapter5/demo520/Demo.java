package chapter5.demo520;

public class Demo {
    public static void main(String[] args) {
        Sex man=Sex.getInstance(1);
        System.out.println(man);
        Sex woman=Sex.getInstance(2);
        System.out.println(woman);
    }
}
