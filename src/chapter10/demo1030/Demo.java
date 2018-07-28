package chapter10.demo1030;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] data = new int[10];
        Arrays.fill(data, 5);
        String str = Arrays.toString(data);//将数组变成字符串形式返回
        System.out.println(str);


    }
}
