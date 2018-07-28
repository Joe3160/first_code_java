package chapter11.demo1107;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "Projects" + File.separator + "java" + File.separator + "demo.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        OutputStream output = new FileOutputStream(file, true);
        String str = "你好，Joe！晚上好!现在是：" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"\r\n");
        byte[] data = str.getBytes();
        output.write(data);
        output.close();
    }
}
