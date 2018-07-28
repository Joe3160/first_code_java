package chapter10.demo1032;

import chapter4.demo421.Array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(new Book("Java入门", 89.99));
        bt.add(new Book("php入门", 69.98));
        //bt.add(new Book("Mysql入门", 59.10));
        //bt.add(new Book("Android入门", 99.80));
        Object[] obj = bt.toArray();
        System.out.println(Arrays.toString(obj));
    }
}
