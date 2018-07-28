package chapter10.demo1047;

import java.lang.reflect.InvocationTargetException;

class Book {
    public Book() {
        System.out.println("****无参构造方法***");
    }

    @Override
    public String toString() {
        return "这是一本书";
    }
}

public class Demo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("chapter10.demo1047.Book");
        //Object object=cls.newInstance();
        //先获取构造方法，再实例化的对象
        Object object = cls.getDeclaredConstructor().newInstance();
        Book book = (Book) object;
        System.out.println(book);
    }
}
