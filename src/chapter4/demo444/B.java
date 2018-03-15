package chapter4.demo444;

public class B extends A {
    private int num = 100;

    public B(int num) {//第⑤步
        this.num = num;
    }

    @Override
    public void print() {//第④步
        //num在子类未构造前，还未被初始化，内容是其对应的数据类型的默认值
        System.out.println("num=" + num);

    }
}
