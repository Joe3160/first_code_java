package chapter11.demo1104;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "Projects");
        if (file.isDirectory()) {
            File[] list=file.listFiles();
            for (File f: list) {
                System.out.println(f);
            }
        }
    }
}
