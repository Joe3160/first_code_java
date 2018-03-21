package chapter6.demo606;

public class Demo606 {
    public static void main(String[] args) {


        try {
            int a = 10 / 0;//异常
            double b = 10.0 / 0;//正常？
            System.out.println(b);
            System.out.println("当你看到这句话时，说明程序正常");
        } catch (ArithmeticException e) {
            System.out.println("当你看到这句时，程序出现算运异常了！！");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("当你看到这句时，程序出现未知异常了！！");
            e.printStackTrace();
        } finally {
            System.out.println("无论是否发生异常，你都能看到这句话");
        }
    }
}
