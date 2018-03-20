package chapter5.demo510;

import chapter5.demo509.DemoA;

public class DemoB extends DemoA {
    public void print() {
        System.out.println("A类的info" + super.info);
    }
}
