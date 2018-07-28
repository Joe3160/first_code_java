package chapter10.demo1019;

import java.math.BigInteger;

public class Demo {
    public static void main(String[] args) {
        BigInteger bigA=new BigInteger("1234567891512233333");
        BigInteger bigB=new BigInteger("1234567891012345567");
        System.out.println("bigA+bigB="+bigA.add(bigB));
        System.out.println("bigA-bigB="+bigA.subtract(bigB));
        System.out.println("bigA*bigB="+bigA.multiply(bigB));
        System.out.println("bigA/bigB="+bigA.divide(bigB));
        BigInteger result[]=bigA.divideAndRemainder(bigB);
        System.out.println("商："+result[0]+"，余数："+result[1]);
    }
}
