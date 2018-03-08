package chapter4.demo419;

public class B extends A{
    /**
     * 覆写父类的方法
     * 如果要调用父类中被覆盖的方法,用 super.方法()
     */
    public void fun(){
        super.fun();//调用父类被覆写的方法
        System.out.println("B的方法fun()");
    }
}
