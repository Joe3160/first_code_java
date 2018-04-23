package chapter9.demo910;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("线程1");
        Ticket t2 = new Ticket("线程2");
        FutureTask<String> task1 = new FutureTask<>(t1);
        FutureTask<String> task2 = new FutureTask<>(t2);
        //执行多线程
        new Thread(task1).start();
        new Thread(task2).start();
        //获取执行结果
        try {
            System.out.println("线程1：执行结果" + task1.get());
            System.out.println("线程2：执行结果" + task2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        
    }
}
