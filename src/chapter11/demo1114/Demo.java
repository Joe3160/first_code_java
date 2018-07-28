package chapter11.demo1114;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "Projects" + File.separator + "java" + File.separator + "write.txt");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        Writer out = new FileWriter(file);
        String str = "Hello World 你好世界！";
        out.write(str);
        out.close();
    }
}
