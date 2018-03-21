package chapter6.demo617;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        assert a == 100 : "当你看到这句话时，证明a不是100";
        System.out.println(a);
    }
}
