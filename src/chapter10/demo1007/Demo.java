package chapter10.demo1007;

public class Demo {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        long max = run.maxMemory();
        long total = run.totalMemory();
        long free = run.freeMemory();
        //1Byte=8bit,1KB=1024B,1MB=1024KB
        int rate=8*1024*1024;
        System.out.println("jvm最大内存:" + max/rate+"MB");
        System.out.println("java已使用内存:" + total/rate+"MB");
        System.out.println("java可使用内内:" + free/rate+"MB");

    }
}
