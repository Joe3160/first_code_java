package chapter4.demo468;

public class Demo {
    public static void main(String[] args) {
        Fruit f=Factory.getInstance("apple");
        f.eat();
    }
}
