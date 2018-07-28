package chapter10.demo1049;

import java.lang.reflect.Constructor;

public class Demo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("chapter10.demo1049.Book");
        Constructor<?> con = cls.getConstructor(String.class, double.class);
        Object object=con.newInstance("Java开发",79.80);
        System.out.println(object);

    }
}
