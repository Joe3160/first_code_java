package chapter10.demo1033;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Book[] books=new Book[]{
          new Book("PHP",68),
          new Book("JAVA",88),
          new Book("JSP",58),
        };
        Arrays.sort(books,new BookComparator());
        System.out.println(Arrays.toString(books));
    }
}
