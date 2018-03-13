package chapter3.lesson17.demo3135;

public class Demo {
    public static void main(String[] args) {
        Link link = new Link();
        link.add(new Book("Java 开发", 78.9));
        link.add(new Book("Android 开发", 98.9));
        link.add(new Book("oracle 开发", 69.6));
        System.out.println("保存书的数量："+link.size());
        link.remove(new Book("oracle 开发", 69.6));
        Book[] books=link.toArray();
        for (int i = 0; i <books.length ; i++) {
            System.out.println(books[i].getInfo());
        }

    }
}
