package chapter10.demo1052;

import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws Exception {
        //获得反射类
        Class<?> cls = Class.forName("chapter10.demo1052.Book");
        //获得类属性
        Field field = cls.getDeclaredField("title");
        //取消private封装
        field.setAccessible(true);
        //实例化类对象
        Object object = cls.getConstructor().newInstance();
        //设置实例对象属性
        field.set(object, "java开发实战经典");
        //获取实例对象属性
        System.out.println(field.get(object));

    }

}
