package chapter8.demo843;

public class Demo {
    public static void main(String[] args) {
        fun((s)-> System.out.println(s));
        System.out.println("------------------");
        fun((s)-> {
            s=s.toUpperCase();
            System.out.println(s);
        });

    }

    public static void fun(UserInterface ui) {
        System.out.println("即将调用抽象类里的抽象方法...");
        ui.print("Hello World");
    }
}

interface UserInterface {
    public void print(String str);
}
