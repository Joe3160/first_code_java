package chapter4.demo446;

public class Demo {
    public static void main(String[] args) {
        Robot robot=new Robot();
        fun(robot,Action.EAT);
        fun(robot,Action.SLEEP);

    }

    public static void fun(Action action,int cmd){
        action.command(cmd);
    }
}
