package chapter10.demo1048;

public class Demo {
    public static void main(String[] args) {
        Fruit fa=Factory.getInstance("chapter10.demo1048.Apple");
        fa.eat();
        Fruit fb=Factory.getInstance("chapter10.demo1048.Orange");
        fb.eat();

    }
}
