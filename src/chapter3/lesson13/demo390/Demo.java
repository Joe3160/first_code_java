package chapter3.lesson13.demo390;

public class Demo {
    public static void main(String[] args){
        Book b1=new Book("Java开发",79.8);
        Book b2=new Book("Java开发",79.8);
        if (b1.compare(b2)) {
            System.out.println("b1与b2相同");
        } else {
            System.out.println("b1与b2不相同");
        }
    }
}
