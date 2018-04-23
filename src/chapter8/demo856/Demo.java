package chapter8.demo856;

import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Supplier<String> supplier="hello"::toUpperCase;
        System.out.println(supplier.get());
    }
}
