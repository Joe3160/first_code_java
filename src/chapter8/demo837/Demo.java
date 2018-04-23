package chapter8.demo837;

public class Demo {
    public static void main(String[] args) {
        Book book=new Book();
        System.out.println(book);

    }
}

class Book {
    @Override
    public String toString() {
        return "这是一本书";
    }
}
