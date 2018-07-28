package chapter11.demo1106;

public class Demo {
    public static void main(String[] args) {
        try(Net n=new Net()) {
            n.info();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
