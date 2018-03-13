package chapter3.lesson17.demo3135;

public class Test2 {
    public static void main(String[] args) {
        Bar a = new Bar();
        Bar b = a;//a的引用地址传给b
        b.setA(200);//b操作内存，相当a操作内存。因为a，b都指向了同一个堆内存地址
        System.out.println(a);//保存a数据的堆内存地址
        System.out.println(b);//保存b数据的堆内存地址
        System.out.println(a.getA());
        System.out.println(b.getA());

        System.out.println("-------------");
        int i1 = 100;//基本类型
        int i2 = i1;//基本类型
        i2 = 200;
        System.out.println(i1);
        System.out.println(i2);

    }
}


class Bar {
    private int a = 100;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
