package chapter10.demo1011;

public class Demo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        String str="";
        for (int i = 0; i <100000 ; i++) {
            str+=i;
        }
        long end=System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+"毫秒");
    }
}
