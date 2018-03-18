package chapter4.demo473;

public class Demo {
    public static void main(String[] args) {
        Book b1 = new Book("Java开发", 79.9);
        Book b2 = new Book("Java开发", 79.9);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));

    }
}
