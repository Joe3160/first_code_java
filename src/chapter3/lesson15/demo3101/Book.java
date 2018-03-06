package chapter3.lesson15.demo3101;

public class Book
{
    static String msg;
    static {
        msg="Hello".substring(0,2);
        System.out.println("【C】Book类中静态块");
    }
    {
        System.out.println("【B】Book类中的构造块");
    }

    public Book(){
        System.out.println("【A】Book类的构造方法");
    }




}
