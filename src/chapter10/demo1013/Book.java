package chapter10.demo1013;

/**
 * @tips: 一定要实现Cloneable接口，否则无法使用Object类的clone方法，会抛异常
 */
public class Book implements Cloneable {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名：" + this.title + "，价格：" + this.price;
    }
    

    @Override
    /**
     * 使用public，使得不同包的非子类也可以调用。
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
