package chapter3.lesson13.demo391;

public class TestDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java开发", 79.8);
        Book b2 = new Book("Android开发", 100);
        Book b3 = new Book("Oracle开发", 99);
        Book.pub="北京大学出版社";
        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
        System.out.println(b3.getInfo());

    }
}
