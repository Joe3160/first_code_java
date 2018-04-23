package chapter8.demo852;

/**
 * 特定类型的方法引用
 * 方法的引用前不再需要要定义对象，可以理解为将对象定义参数上
 */
public class Demo {
    public static void main(String[] args) {
        IMessage<String> msg = String::compareTo;
        System.out.println(msg.compare("A", "B"));
        //System.out.println("dd".compareTo("cc"));;
    }
}
