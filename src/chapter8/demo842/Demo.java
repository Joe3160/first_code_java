package chapter8.demo842;

public class Demo {
    public static void main(String[] args) {
        //匿名内部类
        fun(new UserInterface() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });

        //Lamda表达式
        fun(() -> System.out.println("你好，世界"));

    }

    public static void fun(UserInterface ui) {
        ui.print();
    }

}


interface UserInterface {
    public void print();
}
