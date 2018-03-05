package chapter3.lesson13.demo391;

public class Book {
    private String title;
    private double price;
    static String pub = "清华大学出版社";

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getInfo() {
        return "图书名称：" + title + "，价格：" + price + "，出版社：" + pub;
    }
}
