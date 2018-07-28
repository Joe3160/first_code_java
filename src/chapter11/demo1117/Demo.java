package chapter11.demo1117;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String path = "E:" + File.separator + "Projects" + File.separator + "java" + File.separator + "outwrite.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        OutputStream output = new FileOutputStream(file);
        Writer out = new OutputStreamWriter(output);
        out.write("你好，世界！ Hello World!!!\n\r");
        out.flush();
        out.close();

    }
}
