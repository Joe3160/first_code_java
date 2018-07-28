package chapter11.demo1122;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file_a = new File("E:" + File.separator + "file_a.txt");
        File file_b = new File("E:" + File.separator + "file_b.txt");
        InputStream input_a = new FileInputStream(file_a);
        InputStream input_b = new FileInputStream(file_b);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp = input_a.read()) != -1) {
            output.write(temp);
        }
        while ((temp = input_b.read()) != -1) {
            output.write(temp);
        }
        byte[] data = output.toByteArray();
        output.close();
        input_a.close();
        input_b.close();
        System.out.println(new String(data));
    }
}
