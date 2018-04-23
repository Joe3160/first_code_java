package chapter8.demo839;

public class Demo {
    public static void main(String[] args) {
        Book book=new Book();
        book.fun();
        book.fun2();

    }
}

class Book {
    @Deprecated
    public void fun() {
        System.out.println("这是一本书");
    }

    public void fun2() {
        System.out.println("这是一本新书");
    }
}
