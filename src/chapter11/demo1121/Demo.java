package chapter11.demo1121;

import java.io.*;
import static chapter11.demo1121.Demo.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String str = "Hello_World!!";
        InputStream input = new ByteArrayInputStream(str.getBytes());
        OutputStream output = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp = input.read()) != -1) {//每次只读取一个字节
            //output.write(temp);//字节输出
            output.write(Character.toUpperCase(temp));//字节输出
        }
        System.out.println(output);
        input.close();
        output.close();
    }
}
