package chapter11.demo1102;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "Projects" +
                File.separator + "first_java" + File.separator + "src" +
                File.separator + "chapter11" + File.separator + "demo1102" +
                File.separator + "test" + File.separator + "dd"
                + File.separator + "test.txt");
        if (!file.getParentFile().exists()) {//父路径不存在
            file.getParentFile().mkdirs();//创建多级路径
        }
        System.out.println(file.createNewFile());//创建文件

    }
}
