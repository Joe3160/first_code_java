package chapter8.demo855;

import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        Consumer<String> cons=System.out::println;
        cons.accept("Hello");
    }
}
