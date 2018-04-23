package chapter8.demo835;

public class Demo {
    public static void main(String[] args) {
        Color c=Color.RED;
        switch (c) {
            case RED:
                System.out.println("这是红色");
                break;
            case BLUE:
                System.out.println("这是蓝色");
                break;
            case GREEN:
                System.out.println("这是绿色");
                break;
        }

    }
}

enum Color{
    RED,GREEN,BLUE;
}
