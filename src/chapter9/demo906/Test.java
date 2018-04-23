package chapter9.demo906;

public class Test {
    public static void main(String[] args) {
        String name="线程对象";
        new Thread(()->{
            for (int i = 0; i < 200; i++) {
                System.out.println(name+"-->"+i);
            }
        }).start();
    }
}
