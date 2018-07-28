package chapter11.demo1106;

public class Net implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("**网络资源自动关闭，释放资源***");
    }

    public void info() throws Exception {
        System.out.println("****Hello world****");
    }
}
