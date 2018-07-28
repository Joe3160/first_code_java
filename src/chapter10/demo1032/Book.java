package chapter10.demo1032;

public class Book implements Comparable<Book> {
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

    @Override
    public int compareTo(Book o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price == o.price) {
            return 0;
        } else {
            return 1;
        }
    }
}
