package chapter10.demo1009;

public class Demo {
    public static void main(String[] args) {

        getMemoryInfo();//打印内存信息
        String str="";
        for (int i = 0; i <20000 ; i++) {
            str+=i;
        }
        Runtime run=getMemoryInfo();//打印内存信息
        run.gc();//清除内存垃圾
        getMemoryInfo();//打印内存信息





    }

    public static Runtime getMemoryInfo(){
        Runtime run=Runtime.getRuntime();
        //1Byte=8bit,1KB=1024B,1MB=1024KB
        int rate=8*1024*1024;
        System.out.println("Jvm最大内存："+run.maxMemory()/rate+"MB");
        System.out.println("程序内存："+run.totalMemory()/rate+"MB");
        System.out.println("可用内存："+run.freeMemory()/rate+"MB");
        System.out.println("-------------------------");
        return run;
    }
}
