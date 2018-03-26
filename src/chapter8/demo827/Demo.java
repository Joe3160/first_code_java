package chapter8.demo827;

public class Demo {
    public static void main(String[] args) {
        Color red = Color.RED;
        Color green = Color.GREEN;
        Color blue = Color.BLUE;
        System.out.println(red);

        System.out.println("---------------");
        for (Color x:Color.values()) {
            System.out.println(x.ordinal()+"--"+x.name());
        }
    }
}
