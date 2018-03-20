package chapter5.demo521;

public class Demo {
    public static void main(String[] args) {
        Sex man=Sex.getInstance("man");
        System.out.println(man);
        Sex woman=Sex.getInstance("woman");
        System.out.println(woman);
    }
}
