package chapter11.demo1123;

import java.io.IOException;
import java.io.OutputStream;

public class PrintUtil {
    private OutputStream output;

    public PrintUtil(OutputStream output) {
        this.output = output;
    }

    public void print(String str) {
        try {
            this.output.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(int x) {
        this.print(String.valueOf(x));
    }

    public void print(double x) {
        this.print(String.valueOf(x));
    }

    public void println(String x) {
        this.print(x.concat("\n"));
    }

    public void println(int x) {
        this.println(String.valueOf(x));
    }

    public void println(double x) {
        this.println(String.valueOf(x));
    }

    public void close() {
        try {
            this.output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
