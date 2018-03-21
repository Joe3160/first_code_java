package chapter6.demo612;

public class Demo {
    public static void main(String[] args) {
        People p=new People();
        try {
            p.setAge(-2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
