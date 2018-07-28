package chapter11.demo1118;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        if (args.length == 0) {
            System.out.println("请输入：原文件路径 目前文件路径");
            System.exit(1);
        } else if (args.length == 1) {
            System.out.println("请输入：目前文件路径");
            System.exit(1);
        }
        //文件路径验证
        File inFile = new File(args[0]);
        if (!inFile.exists()) {
            System.out.println("源文件路径不正确");
            System.exit(1);//退出程序
        }
        File outFile = new File(args[1]);
        if (!outFile.getParentFile().exists()) {
            outFile.getParentFile().mkdirs();//创建目标文件路径
        }
        //实现文件的复制
        InputStream input = new FileInputStream(inFile);
        OutputStream output = new FileOutputStream(outFile);
        //int temp = 0;//保存每次读取的内容
        //while ((temp = input.read()) != -1) {//每次读取单个字节
        //    output.write(temp);//输出单个字节
        //}
        int temp = 0;//保存每次读取的长度
        byte data[] = new byte[1024];
        while ((temp = input.read(data)) != -1) {
            output.write(data);
        }
        input.close();
        output.close();
        long end = System.currentTimeMillis();
        System.out.println("程序执行所花费时间" + (end - start) + "毫秒");

    }
}
