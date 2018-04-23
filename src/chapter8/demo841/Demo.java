package chapter8.demo841;

public class Demo {
    public static void main(String[] args) {
        User user=new User();
        user.print();
        user.fun();

        System.out.println("-------------");
        UserInterface ui=new User();
        ui.fun();
        UserInterface.fun2();
    }
}
