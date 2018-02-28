package chapter3.lesson5;

/**
 * 匿名对象
 */
public class Book {
    private String title;
    private double price;

    public Book(String t,double p) {
        title=t;
        price=p;
    }

    public void getInfo() {
        System.out.println("图书名称："+title+",价格："+price);
    }


}
