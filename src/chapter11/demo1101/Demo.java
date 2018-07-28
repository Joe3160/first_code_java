package chapter11.demo1101;

import java.io.File;

public class Demo {
    public static void main(String[] args) throws Exception {

        File file = new File("E:"+File.separator+"Projects"+File.separator+"first_java"+File.separator+"test.txt");
        if (file.exists()) {//判断文件是否存在
            file.delete();//创建文件
        } else {
            file.createNewFile();//创建文件
        }


    }
}
