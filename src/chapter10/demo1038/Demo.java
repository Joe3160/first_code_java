package chapter10.demo1038;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String str="a_b_c_d_e_f";
        String regex="_";
        String[] result=str.split(regex);
        System.out.println(Arrays.toString(result));
    }
}
