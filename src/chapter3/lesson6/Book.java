package chapter3.lesson6;

public class Book {
    private String title;
    private double price;

    public Book(String title,double price) {
        this.title=title;
        this.price=price;
    }

    public String toString(){
        return "书名："+title+",价格："+price;
    }


}
