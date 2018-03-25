package chapter8.demo813;

public class Demo {
    public static void main(String[] args) {
        Point<String> p=new Point<String>();
        p.setX("东经120度");
        p.setY("北纬25度");
        System.out.println(p.getX());
        System.out.println(p.getY());

        System.out.println("----------------");
        Point<Integer> p2=new Point<>();
        p2.setX(100);
        p2.setY(200);
        System.out.println(p2.getX());
        System.out.println(p2.getY());
    }
}
