package chapter3.lesson6;

public class ArrayObjects {
    public static void main(String[] args) {
        Book[] book=new Book[]{
          new Book("Java",100),
          new Book("JSP",60.20),
          new Book("Android",101),
        };
        dump(book);
    }


    public static <T> void dump(T arr[]){
        for (T t : arr) {
            System.out.println(t);
        }
    }

}
