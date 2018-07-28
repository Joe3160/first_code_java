package chapter10.demo1049;

public class Book {
    private String title;
    private double price;

    public Book() {
        System.out.println("**这是无参构造方法**");
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名：" + this.title + "，价格：" + this.price;
    }
}
