package chapter10.demo1016;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random=new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+"、"+random.nextInt(100));
        }
    }
}
