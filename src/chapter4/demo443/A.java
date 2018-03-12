package chapter4.demo443;

public abstract class A {
    public abstract void print();

    private static class B extends A {
        @Override
        public void print() {
            System.out.println("A.B、public void print(){}");
        }
    }

    public static A getInstanceB() {
        return new B();
    }


}
