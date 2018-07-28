package chapter11.demo1115;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String path = "E:" + File.separator + "Projects" + File.separator + "java" + File.separator + "write.txt";
        File file = new File(path);
        if (file.exists()) {
            Reader reader = new FileReader(file);
            char[] data = new char[1024];
            int len = reader.read(data);
            reader.close();
            System.out.println(new String(data, 0, len));
        }

    }
}
