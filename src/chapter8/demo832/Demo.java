package chapter8.demo832;

public class Demo {
    public static void main(String[] args) {
        IMessage msg = Color.RED;
        System.out.println(msg.getTitle());

    }
}


interface IMessage {
    public String getTitle();
}

enum Color implements IMessage {
    RED("红色"), GREEN("绿色"), BLUE("蓝色");//定义多个实例

    private String title;

    private Color(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
