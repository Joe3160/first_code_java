package chapter8.demo851;

public class Demo {
    public static void main(String[] args) {
        IMessage<String> message="Hello"::toUpperCase;
        String str=message.upper();
        System.out.println(str);
    }
}
