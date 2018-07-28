package chapter10.demo1020;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {
    public static void main(String[] args) {
        BigDecimal big1 = new BigDecimal(3.6789);
        System.out.println(round(234.56789,2));
        System.out.println(round(-234.56789,2));

    }

    /**
     * 准确的四舍五入操作
     * @param num   操作小数字
     * @param scale 保留的小数位
     * @return 处理后的四舍五入数据
     */
    public static double round(double num, int scale) {
        BigDecimal big1 = new BigDecimal(num);
        BigDecimal big2 = new BigDecimal(1);
        return big1.divide(big2, scale, RoundingMode.HALF_UP).doubleValue();
    }
}
