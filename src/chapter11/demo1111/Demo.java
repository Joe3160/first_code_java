package chapter11.demo1111;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String path = "E:" + File.separator + "Projects" + File.separator + "java" + File.separator + "demo.txt";
        File file = new File(path);
        if (file.exists() == false) {
            System.out.println("文件不存在");
            return;
        }
        InputStream input = new FileInputStream(file);
        byte[] data = new byte[1024];
        int len = input.read(data);
        input.close();
        System.out.println(new String(data, 0, len));

    }
}
