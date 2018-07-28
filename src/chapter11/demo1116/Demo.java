package chapter11.demo1116;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo {
    public static void main(String[] args) throws IOException {
        //1定义要输出的文件路径
        File file = new File("E:" + File.separator + "Projects" + File.separator + "java" + File.separator + "demo1116.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        //2 实例化IO对象
        Writer writer = new FileWriter(file);
        //3 IO操作
        String str = "好好学习，天天向上 Good Good Study,Day Day Up";
        writer.write(str);
        //4 关闭IO流
        //writer.close();
        writer.flush();


    }
}
