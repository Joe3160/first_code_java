package chapter3.lesson13.demo389;

public class TestDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java开发", 79.8);
        Book b2 = new Book("Java开发", 79.8);
        if (b1.getPrice() == b2.getPrice() && b1.getTitle() == b2.getTitle()) {
            System.out.println("b1与b2相同");
        } else {
            System.out.println("b1与b2不相同");
        }
        String a = "";
        System.out.println(a.equals(null));
        System.out.println(null == null);
    }
}
