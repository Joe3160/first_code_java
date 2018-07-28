package chapter11;

public class Demo {
    public static <T> void dump(T t) {
        System.out.println(t);;
        if (t instanceof String) {
            System.out.println("string(" + ((String) t).length() + ")" + "\"" + t + "\"");
        } else {
            System.out.println(888);
        }
    }
}
