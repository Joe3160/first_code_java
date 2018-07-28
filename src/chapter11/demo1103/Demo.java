package chapter11.demo1103;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "localhost" + File.separator + "huide_test.sql");
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("是否是目录：" + file.isDirectory());
        System.out.println("文件大小：" + (new BigDecimal(file.length())).divide(new BigDecimal(1024 * 1024), 2, RoundingMode.HALF_UP) + "MB");
        System.out.println("最后一次修改时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
    }
}
