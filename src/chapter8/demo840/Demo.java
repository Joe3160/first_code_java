package chapter8.demo840;

public class Demo {
    public static void main(String[] args) {
        @SuppressWarnings({"rawtypes", "unchecked"})
        Book book;
        book = new Book();
        book.setTitle("Java");

    }
}

class Book<T> {
    private T title;

    public T getTitle() {
        return title;
    }

    public void setTitle(T title) {
        this.title = title;
    }
}