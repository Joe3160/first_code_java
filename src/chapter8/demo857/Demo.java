package chapter8.demo857;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        Predicate<String> predicate="Hello"::equalsIgnoreCase;
        System.out.println(predicate.test("HELLO"));
    }
}
