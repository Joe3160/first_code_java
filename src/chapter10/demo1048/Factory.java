package chapter10.demo1048;

import java.lang.reflect.InvocationTargetException;

public class Factory {
    public static Fruit getInstance(String className){
        Fruit fruit=null;
        try {
            fruit = (Fruit) Class.forName(className).getConstructor().newInstance();
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return fruit;
    }
}
