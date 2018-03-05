package chapter3.lesson13.demo390;

public class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    /**
     * book传进方法，那么book的属性就内部对象了，
     * 即使用private，用内部类中依然可以访问,
     * 如book.title直接访问private对象title
     *
     * @param book
     * @return
     */
    public boolean compare(Book book) {

        if (book == null) {
            return false;//没有必要进行判断
        }
        if (this == book) {
            return true;//内存地址相同
        }
        if (this.title.equals(book.title) && this.price == book.price) {
            return true;
        } else {
            return false;
        }
    }

}
