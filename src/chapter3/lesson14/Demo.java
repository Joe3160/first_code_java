package chapter3.lesson14;

public class Demo {
    public static void main(String[] args) {
        new Book();
        new Book();
        new Book();
        new Book();
        new Book();
    }
}

class Book {
    static int num = 0;

    public Book() {
        num++;
        System.out.println("这是第" + num + "个实例对象");
    }
}
