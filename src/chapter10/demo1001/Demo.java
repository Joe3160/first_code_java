package chapter10.demo1001;

public class Demo {
    public static void main(String[] args) {
        //String类可以直接实列化,StringBuffer类不行
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello").append(" ").append("World").append("!");
        change(buffer);//引用传递
        System.out.println(buffer);
    }

    public static void change(StringBuffer buffer) {
        buffer.append("\n").append("你好，世界！");
    }
}
