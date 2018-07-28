package chapter10.demo1033;

import java.util.Comparator;

public class Book {
    private String title;
    private double price;

    public Book() {
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
        return "书名：" + this.title + " ，价格：" + this.price;
    }
}

class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}

