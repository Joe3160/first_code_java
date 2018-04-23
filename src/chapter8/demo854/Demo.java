package chapter8.demo854;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Function<String,Boolean> fun="**Hello**"::startsWith;
        boolean flag=fun.apply("**");
        System.out.println(flag);
    }
}
