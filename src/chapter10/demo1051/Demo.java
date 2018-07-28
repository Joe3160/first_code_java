package chapter10.demo1051;

import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception {
        String fieldName = "title";
        Class<?> cls = Class.forName("chapter10.demo1051.Book");
        Object object = cls.getConstructor().newInstance();
        Method setMethod = cls.getMethod("set" + initCap(fieldName), String.class);
        Method getMethod = cls.getMethod("get" + initCap(fieldName));
        setMethod.invoke(object, "java开发指南");
        String result = (String) getMethod.invoke(object);
        System.out.println(result);


    }

    /**
     * 字符串转首字母大写
     * @param str
     * @return
     */
    public static String initCap(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
