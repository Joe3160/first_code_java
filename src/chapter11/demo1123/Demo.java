package chapter11.demo1123;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo {


    public static void main(String[] args) throws FileNotFoundException {
        PrintUtil pu = new PrintUtil(new FileOutputStream(new File("E:" + File.separator + "demo.txt")));
        pu.print("你好，世界！！");
        pu.print("Hello World");
        pu.print(38);
        pu.print(3.1415926d);
        pu.println("\n----------这是分割线--------------");
        pu.println("你好，世界！！");
        pu.println("Hello World");
        pu.println(38);
        pu.println(3.1415926d);
        pu.close();
    }
}
