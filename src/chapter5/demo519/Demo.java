package chapter5.demo519;

public class Demo {
    public static void main(String[] args) {
        Singleton inst = Singleton.getInstance();
        System.out.println(inst);//查看对象内存地址信息
        inst.print();//执行对象的方法
        Singleton inst2 = Singleton.getInstance();
        System.out.println(inst2);//查看对象内存地址信息
        inst2.print();
        System.out.println(inst == inst2);//inst、inst2是否同一个实例对象
    }
}
