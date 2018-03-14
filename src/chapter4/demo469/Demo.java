package chapter4.demo469;

public class Demo {
    public static void main(String[] args) {
        Network net = new Proxy(new Real());
        net.browse();
    }
}
