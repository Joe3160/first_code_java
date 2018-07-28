package chapter11.demo1119;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        //byte[] data="你好".getBytes();
        //for (byte b:data) {
        //    System.out.println(b);
        //}
        File file=new File("E:"+File.separator+"hello.txt");
        FileOutputStream output=new FileOutputStream(file);
        //output.write("你好".getBytes());
        output.write("你好".getBytes("ISO8859-1"));
    }
}
