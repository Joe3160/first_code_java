package chapter10.demo1010;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        Runtime run=Runtime.getRuntime();
        try {
            Process process=run.exec("notepad");
            Thread.sleep(2000);
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
