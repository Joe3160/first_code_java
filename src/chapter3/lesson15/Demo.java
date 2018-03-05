package chapter3.lesson15;

public class Demo {
    public static void main(String[] args) {
        new Book();
        new Book();

    }
}

class Book {
    public Book() {
        System.out.println("【A】Book的构造方法");
    }

    //构造块
    {
        System.out.println("【B】Book类中的构造块");
    }

    //静态块
    static {
        System.out.println("【C】Book类中的静态块");
    }
}
