package chapter10.demo1012;

public class Foo {
    public Foo() {
        System.out.println("对象诞生了！");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象即将被销毁！");
        throw new Exception("此处抛出异常也不会给对象造成任何影响，这么写是为了表现程序的完整性，规范一点。");
    }
}
