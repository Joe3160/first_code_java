package chapter4.demo436;

public class X extends A {
    public void print() {
        System.out.println("X、public void print(){}");
    }


    public class Y extends B {
        @Override
        public void print() {
            System.out.println("Y、public void print(){}");
        }
    }

}
