package chapter10.demo1013;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("Java", 98.87);
        Book book2 = (Book) book1.clone();
        book2.setTitle("php开发指南");
        System.out.println(book1);
        System.out.println(book2);

    }

}


