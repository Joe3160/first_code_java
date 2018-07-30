package chapter11.demo1125;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:" + File.separator + "Projects" + File.separator + "java" + File.separator + "demo1125.txt");
        OutputStream output = new FileOutputStream(file);
        PrintStream pu = new PrintStream(output);
        String name = "Joe";
        int age = 18;
        double score = 88.6296;
        pu.format("姓名：%s ,年龄：%d，成绩：%5.2f ", name, age, score);
        pu.close();

    }
}
