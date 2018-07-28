package chapter11.demo1112;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String path = "E:" + File.separator + "Projects" + File.separator + "java" + File.separator + "demo.txt";
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }
        InputStream input = new FileInputStream(file);
        byte data[] = new byte[1024];//由于不能提前不知道文本字符的长度，不能取太小，不然容易发数组超界
        int foot = 0;
        int tmp = 0;
        while ((tmp = input.read()) != -1) {
            data[foot++] = (byte) tmp;
        }
        input.close();
        System.out.println(new String(data, 0, foot));
    }
}
