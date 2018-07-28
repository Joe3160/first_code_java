package chapter10.demo1031;

import chapter4.demo421.Array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Java入门到放弃", 57.99),
                new Book("Mysql删库到跑路", 88.99),
                new Book("PHP入行到改行", 67.56),
        };
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
    }
}
