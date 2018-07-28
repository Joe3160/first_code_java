package chapter10.demo1014;

public class Demo {
    public static void main(String[] args) {
        //Math.round 取整
        //正数：直接四舍五入
        //负数：小数部份大于0.5才进位，否则舍去小数部，只保留整数部份。
        System.out.println("15.13四舍五入取整："+Math.round(15.13));
        System.out.println("-15.13四舍五入取整："+Math.round(-15.13));
        System.out.println("15.93四舍五入取整："+Math.round(15.93));
        System.out.println("-15.93四舍五入取整："+Math.round(-15.93));
    }
}
