package chapter8.demo850;

/**
 * 引用特定类的接口
 * 特定类::普通方法
 */
public class Demo {
    public static void main(String[] args) {
        //方法的引用，当接口只有一个抽象方法时才可定义引用方法
        IMessage<Integer, String> msg = String::valueOf;
        String str = msg.convert(100);
        System.out.println(str);
        System.out.println(str.replaceAll("0", "1"));

    }


}
