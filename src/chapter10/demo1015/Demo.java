package chapter10.demo1015;

public class Demo {
    public static void main(String[] args) {
        System.out.println(round(23.4535, 3));
        System.out.println(round(23.4535));
    }

    /**
     * 创建默认参数
     * @param num
     * @return
     */
    public static double round(double num) {
        return round(num, 2);
    }

    public static double round(double num, int scale) {
        double temp = Math.pow(10, scale);
        return Math.round(num * temp) / temp;
    }
}
