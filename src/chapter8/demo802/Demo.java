package chapter8.demo802;

public class Demo {
    public static void main(String[] args) {
        int a=add(1,2,3);
        System.out.println(a);
        System.out.println("-------------");
        int b=add(2,4,6,8,10);
        System.out.println(b);
    }

    /**
     * 可变参数
     * @param data
     * @return
     */
    private static int add(int... data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
}
