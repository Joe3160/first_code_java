package chapter8.demo844;

public class Demo {
    public static void main(String[] args) {
        fun((a, b) -> a + b);
    }

    public static void fun(Math math) {
        System.out.println(math.add(10, 30));
    }

}

interface Math {
    public int add(int x, int y);
}
