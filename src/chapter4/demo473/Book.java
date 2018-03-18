package chapter4.demo473;

public class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {//地址相同
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Book)) {
            return false;//不同类
        }

        Book book = (Book) obj;
        if (book.price == this.price && book.title == this.title) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "书名：" + this.title + "，价格：" + this.price;
    }
}
