package chapter8.demo833;

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
    RED("红色") {
        @Override
        public String getTitle() {
            return this + "-red";
        }
    }, GREEN("绿色") {
        @Override
        public String getTitle() {
            return this + "-green";
        }
    }, BLUE("蓝色") {
        @Override
        public String getTitle() {
            return this + "-blue";
        }
    };

    private String title;

    private Color(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return this.title;
    }

    public abstract String getTitle();//定义抽象方法
}
