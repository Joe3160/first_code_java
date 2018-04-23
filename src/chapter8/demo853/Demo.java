package chapter8.demo853;

import chapter4.demo427.B;

public class Demo {
    public static void main(String[] args) {
        IMessage<Book> msg = Book::new;
        //虽然调用是msg.create()，实际调用是Book类的构造方法
        Book book = msg.create("Java", 79.9);
        System.out.println(book);

    }
}

@FunctionalInterface
interface IMessage<T> {
    public T create(String str, double price);
}

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名：" + this.title + "，价格：" + this.price;
    }
}