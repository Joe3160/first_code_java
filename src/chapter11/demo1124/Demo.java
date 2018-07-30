package chapter11.demo1124;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream(new File("E:" + File.separator + "demo2.txt")));
        ps.print("Hello ");
        ps.println(" World!");
        ps.println(3.1415926d);
        ps.println(3.14f);
        ps.println(100);
        ps.println(false);
        ps.close();
    }
}
