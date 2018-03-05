package chapter3.lesson13.demo393;

public class Book {
    private String title;
    private double price;
    private static String pub = "清华大学出版社";

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public static void setPub(String pub) {
        Book.pub = pub;
    }

    public String getInfo() {
        return "图书名称：" + title + "，价格：" + price + "，出版社：" + pub;
    }
}
