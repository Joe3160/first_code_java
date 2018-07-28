package chapter11.demo1118;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        if (args.length != 2) {
            System.out.println("命令执行错误");
            System.exit(1);
        }
        File inFile = new File(args[0]);
        if (!inFile.exists()) {
            System.out.println("文件不存在");
            System.exit(1);
        }
        File outFile = new File(args[1]);
        if (!outFile.getParentFile().exists()) {
            outFile.getParentFile().mkdirs();
        }
        InputStream input = new FileInputStream(inFile);
        OutputStream output = new FileOutputStream(outFile);
        int temp = 0;
        byte[] data = new byte[1024];
        //循环读取并写入
        while ((temp = input.read(data)) != -1) {
            output.write(data, 0, temp);//不知是追加写入还是覆盖写入?
        }
        input.close();
        output.close();
        long end = System.currentTimeMillis();
        System.out.println("程序执行所花时间：" + (end - start));


    }
}
